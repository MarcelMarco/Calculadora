package edu.upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.editTextNumberDecimal);
        for(int i=0;i<varNums.length;i++){
            varNums[i] = 0.0d;
        }
    }

    private static double suma(double i, double j){
        return i+j;
    }
    private static double resta(double i, double j){
        return i-j;
    }
    private static double mult(double i, double j){
        return i*j;
    }
    private static double div(double i, double j){
        return i/j;
    }
    private static double sind(double i,double a){
        double b = Math.toDegrees(a);
        return i+Math.sin(b);
    }
    private static double cosd(double i,double a){
        double b = Math.toDegrees(a);
        return i+Math.cos(b);
    }
    private static double tand(double i,double a){
        double b = Math.toDegrees(a);
        return i+Math.tan(b);
    }
    private static double sinr(double i,double a){
        double b = Math.toRadians(a);
        return i+Math.sin(b);
    }
    private static double cosr(double i,double a){
        double b = Math.toRadians(a);
        return i+Math.cos(b);
    }
    private static double tanr(double i,double a){
        double b = Math.toRadians(a);
        return i+Math.tan(b);
    }

    private String op="";
    private String[] varOps = new String[10];
    private int indicevarOps = 0;
    private Double varNums[] = new Double[20];

    public void button_0onClick(View view) {
        op = op + "0";
        textView.setText(op);
    }

    public void button_1onClick(View view) {
        op = op + "1";
        textView.setText(op);
    }

    public void button_2onClick(View view) {
        op = op + "2";
        textView.setText(op);
    }

    public void button_3onClick(View view) {
        op = op + "3";
        textView.setText(op);
    }

    public void button_4onClick(View view) {
        op = op + "4";
        textView.setText(op);
    }

    public void button_5onClick(View view) {
        op = op + "5";
        textView.setText(op);
    }

    public void button_6onClick(View view) {
        op = op + "6";
        textView.setText(op);
    }

    public void button_7onClick(View view) {
        op = op + "7";
        textView.setText(op);
    }

    public void button_8onClick(View view) {
        op = op + "8";
        textView.setText(op);
    }

    public void button_9onClick(View view) {
        op = op + "9";
        textView.setText(op);
    }

    public void button_clearonClick(View view) {
        op="";
        textView.setText(op);
        indicevarOps = 0;
        for(int i=0;i<varOps.length;i++){
            varOps[i] = "";
        }
        for(int i=0;i<varNums.length;i++){
            varNums[i] = 0.0d;
        }
    }

    public void button_equalonClick(View view) {
        String[] numfinales = new String[20];
        String[] numfinales2 = new String[20];
        String ntrigo = "";

        numfinales = op.split("\\+|-|\\*|/");

        for(int i=0;i<varOps.length;i++){
            if(varOps[i] == "sind"){
                ntrigo = numfinales[i];
                numfinales2 = ntrigo.split("sin");
                numfinales[i] = numfinales2[1];
            } else if (varOps[i] == "sinr"){
                ntrigo = numfinales[i];
                numfinales2 = ntrigo.split("sin");
                numfinales[i] = numfinales2[1];
            } else if (varOps[i] == "cosd"){
                ntrigo = numfinales[i];
                numfinales2 = ntrigo.split("cos");
                numfinales[i] = numfinales2[1];
            } else if (varOps[i] == "cosr"){
                ntrigo = numfinales[i];
                numfinales2 = ntrigo.split("cos");
                numfinales[i] = numfinales2[1];
            } else if (varOps[i] == "tand"){
                ntrigo = numfinales[i];
                numfinales2 = ntrigo.split("tan");
                numfinales[i] = numfinales2[1];
            } else if (varOps[i] == "tanr"){
                ntrigo = numfinales[i];
                numfinales2 = ntrigo.split("tan");
                numfinales[i] = numfinales2[1];
            }
        }

        //Limpio el vector para hacer la prueba con numeros de mas de 1 digito
        for(int i=0;i<varNums.length;i++){
            varNums[i] = 0.0d;
        }

        for (int i=0;i<numfinales.length;i++){
            varNums[i] = Double.parseDouble(numfinales[i]);
        }

        double res;

        if(varOps[0] == "s"){
            res = varNums[0];
        } else if (varOps[0] == "r"){
            res = varNums[0];
        } else if (varOps[0] == "m"){
            res = varNums[0];
        } else if (varOps[0] == "d"){
            res = varNums[0];
        } else {
            res = 0;
        }


        for(int i=0;i<varOps.length;i++){
            if(varOps[i] == "s"){
                res = suma(res,varNums[i+1]);
            } else if (varOps[i] == "r"){
                res = resta(res,varNums[i+1]);
            } else if (varOps[i] == "m"){
                res = mult(res,varNums[i+1]);
            } else if (varOps[i] == "d"){
                res = div(res,varNums[i+1]);
            } else if (varOps[i] == "sind"){
                res = sind(res,varNums[i]);
            } else if (varOps[i] == "cosd"){
                res = cosd(res,varNums[i]);
            } else if (varOps[i] == "tand"){
                res = tand(res,varNums[i]);
            } else if (varOps[i] == "sinr"){
                res = sinr(res,varNums[i]);
            } else if (varOps[i] == "cosr"){
                res = cosr(res,varNums[i]);
            } else if (varOps[i] == "tanr"){
                res = tanr(res,varNums[i]);
            }
        }

        String resultado = Double.toString(res);
        textView.setText(resultado);

        op="";
        indicevarOps = 0;
        for(int i=0;i<varOps.length;i++){
            varOps[i] = "";
        }
        for(int i=0;i<varNums.length;i++){
            varNums[i] = 0.0d;
        }
    }

    public void button_addonClick(View view) {
        op=op + "+";
        textView.setText(op);
        varOps[indicevarOps] = "s";
        indicevarOps++;
    }

    public void button_subsonClick(View view) {
        op=op + "-";
        textView.setText(op);
        varOps[indicevarOps] = "r";
        indicevarOps++;
    }

    public void button_multonClick(View view) {
        op=op + "*";
        textView.setText(op);
        varOps[indicevarOps] = "m";
        indicevarOps++;
    }

    public void button_divonClick(View view) {
        op=op + "/";
        textView.setText(op);
        varOps[indicevarOps] = "d";
        indicevarOps++;
    }

    public void button_sindonClick(View view) {
        op=op + "sin";
        textView.setText(op);
        varOps[indicevarOps] = "sind";
        indicevarOps++;
    }

    public void button_cosdonClick(View view) {
        op=op + "cos";
        textView.setText(op);
        varOps[indicevarOps] = "cosd";
        indicevarOps++;
    }

    public void button_tandonClick(View view) {
        op=op + "tan";
        textView.setText(op);
        varOps[indicevarOps] = "tand";
        indicevarOps++;
    }

    public void button_sinronClick(View view) {
        op=op + "sin";
        textView.setText(op);
        varOps[indicevarOps] = "sinr";
        indicevarOps++;
    }

    public void button_cosronClick(View view) {
        op=op + "cos";
        textView.setText(op);
        varOps[indicevarOps] = "cosr";
        indicevarOps++;
    }

    public void button_tanronClick(View view) {
        op=op + "tan";
        textView.setText(op);
        varOps[indicevarOps] = "tanr";
        indicevarOps++;
    }
}
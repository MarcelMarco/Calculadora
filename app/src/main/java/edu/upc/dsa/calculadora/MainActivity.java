package edu.upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
    private static double sind(double a){
        double b = Math.toDegrees(a);
        return Math.sin(b);
    }
    private static double cosd(double a){
        double b = Math.toDegrees(a);
        return Math.sin(b);
    }
    private static double tand(double a){
        double b = Math.toDegrees(a);
        return Math.sin(b);
    }
    private static double sinr(double a){
        double b = Math.toRadians(a);
        return Math.sin(b);
    }
    private static double cosr(double a){
        double b = Math.toRadians(a);
        return Math.sin(b);
    }
    private static double tanr(double a){
        double b = Math.toRadians(a);
        return Math.sin(b);
    }

    private String op="";
    private String[] varOps = new String[10];
    private int indicevarOps = 0;
    private Double varNums[] = new Double[20];
    private int indicevarNums = 0;

    public void button_0onClick(View view) {
        op = op + "0";
        textView.setText(op);
        varNums[indicevarNums] = 0.0d;
        indicevarNums++;
    }

    public void button_1onClick(View view) {
        op = op + "1";
        textView.setText(op);
        varNums[indicevarNums] = 1.0d;
        indicevarNums++;
    }

    public void button_2onClick(View view) {
        op = op + "2";
        textView.setText(op);
        varNums[indicevarNums] = 2.0d;
        indicevarNums++;
    }

    public void button_3onClick(View view) {
        op = op + "3";
        textView.setText(op);
        varNums[indicevarNums] = 3.0d;
        indicevarNums++;
    }

    public void button_4onClick(View view) {
        op = op + "4";
        textView.setText(op);
        varNums[indicevarNums] = 4.0d;
        indicevarNums++;
    }

    public void button_5onClick(View view) {
        op = op + "5";
        textView.setText(op);
        varNums[indicevarNums] = 5.0d;
        indicevarNums++;
    }

    public void button_6onClick(View view) {
        op = op + "6";
        textView.setText(op);
        varNums[indicevarNums] = 6.0d;
        indicevarNums++;
    }

    public void button_7onClick(View view) {
        op = op + "7";
        textView.setText(op);
        varNums[indicevarNums] = 7.0d;
        indicevarNums++;
    }

    public void button_8onClick(View view) {
        op = op + "8";
        textView.setText(op);
        varNums[indicevarNums] = 8.0d;
        indicevarNums++;
    }

    public void button_9onClick(View view) {
        op = op + "9";
        textView.setText(op);
        varNums[indicevarNums] = 9.0d;
        indicevarNums++;
    }

    public void button_clearonClick(View view) {
        op="";
        textView.setText(op);
        indicevarNums = 0;
        indicevarOps = 0;
        for(int i=0;i<varOps.length;i++){
            varOps[i] = "";
        }
        for(int i=0;i<varNums.length;i++){
            varNums[i] = 0.0d;
        }
    }

    public void button_equalonClick(View view) {

        double res = varNums[0];
        int x = 0;

        for(int i=0;i<indicevarOps;i++){
            if(varOps[i] == "s"){
                res = suma(res,varNums[i+1]);
            } else if (varOps[i] == "r"){
                res = resta(res,varNums[i+1]);
            } else if (varOps[i] == "m"){
                res = mult(res,varNums[i+1]);
            } else if (varOps[i] == "d"){
                res = div(res,varNums[i+1]);
            } else if (varOps[i] == "sind"){
                res = sind(varNums[i]);
            } else if (varOps[i] == "cosd"){
                res = cosd(varNums[i]);
            } else if (varOps[i] == "tand"){
                res = tand(varNums[i]);
            } else if (varOps[i] == "sinr"){
                res = sinr(varNums[i]);
            } else if (varOps[i] == "cosr"){
                res = cosr(varNums[i]);
            } else if (varOps[i] == "tanr"){
                res = tanr(varNums[i]);
            }
        }

        String resultado = Double.toString(res);
        textView.setText(resultado);

        op="";
        indicevarNums = 0;
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
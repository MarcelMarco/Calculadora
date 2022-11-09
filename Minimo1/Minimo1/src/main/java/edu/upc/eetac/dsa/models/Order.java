package edu.upc.eetac.dsa.models;

import java.util.*;
import edu.upc.eetac.dsa.models.LP.LP;

public class Order {
    String userId;
    LinkedList<LP> elements;

    public Order(){}

    public Order(String userId) {
        this.userId = userId;
        this.elements = new LinkedList<>();
    }

    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
        this.elements = new LinkedList<>();
    }

    public LinkedList<LP> getElements() {
        return this.elements;
    }
    public void setElements(LinkedList<LP> elements) {
        this.elements = elements;
    }

    //Añadimos la cantidad i del producto b001
    public void addLP(int i, String b001){
        elements.add(new LP(i, b001));
    }
    //Nos da la LP que se encuentra en la posicion i de la LinkedList
    public LP getLP(int i) {
        return elements.get(i);
    }
}

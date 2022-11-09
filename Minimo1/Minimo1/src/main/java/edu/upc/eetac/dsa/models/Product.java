package edu.upc.eetac.dsa.models;

import java.util.Objects;

public class Product {
    private String productID;
    private String name;
    private double price;
    int sales;

    public Product(){}

    public Product(String productID, String name, double price, int sales){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.sales = sales;
    }
    public String getProductId(){
        return this.productID;
    }
    public void setProductId(String productID){
        this.productID = productID;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription(){
        return this.name;
    }
    public void setDescription(){
        this.name = name;
    }
    public int getNumSales(){
        return this.sales;
    }
    public void setNumSales(int numSales) {
        this.sales = numSales;
    }

    public void sold(int x){
        this.sales = sales + x;
    }

    public boolean isNull() {
        return(Objects.equals(productID, ""));
    }
}

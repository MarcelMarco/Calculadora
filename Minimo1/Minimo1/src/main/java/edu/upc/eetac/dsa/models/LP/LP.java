package edu.upc.eetac.dsa.models.LP;

public class LP {
    private int quantity;
    private String product;

    public LP(){}
    public LP(int quantity, String product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}

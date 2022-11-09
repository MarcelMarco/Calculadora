package edu.upc.eetac.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String Id;
    private String name;
    private String surname;

    List<Order> processedOrders;

    public User(){}

    public User(String Id,String name,String surname){
        this.Id = Id;
        this.name = name;
        this.surname = surname;
        this.processedOrders = new LinkedList<>();
    }

    public String getId() {
        return this.Id;
    }
    public void setId(String userId) {
        this.Id = userId;
    }

    public String getUserName() {
        return this.name;
    }
    public void setUserName(String userName) {
        this.name = userName;
    }

    public String getUserSurname() {
        return this.surname;
    }
    public void setUserSurname(String userSurname) {
        this.surname = userSurname;
    }

    public void addProcessedOrder(Order order) {
        this.processedOrders.add(order);
    }
    public List<Order> getProcessedOrders() {
        return this.processedOrders;
    }
}

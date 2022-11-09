package edu.upc.eetac.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String fecha;
    private String correo;
    private String password;
    private String Id;
    private int saldo;

    List<Objeto> objetosUser;

    public User(){}

    public User(String name, String surname, String fecha, String correo, String password, String id, int saldo) {
        this.name = name;
        this.surname = surname;
        this.fecha = fecha;
        this.correo = correo;
        this.password = password;
        this.Id = id;
        this.saldo = saldo;
        this.objetosUser = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Objeto> getObjetosUser() {
        return this.objetosUser;
    }

    public void setObjetosUser(List<Objeto> objetosUser) {
        this.objetosUser = objetosUser;
    }
}

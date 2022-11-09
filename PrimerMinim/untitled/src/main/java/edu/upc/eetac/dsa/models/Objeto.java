package edu.upc.eetac.dsa.models;

import java.util.*;
import edu.upc.eetac.dsa.models.LO.ListaObjetos;
public class Objeto {
    private String nombre;
    private String descripcion;
    private int precio;
    LinkedList<ListaObjetos> elements;

    public Objeto(){}

    public LinkedList<ListaObjetos> getElements() {
        return this.elements;
    }

    public void setElements(LinkedList<ListaObjetos> elements) {
        this.elements = elements;
    }

    public Objeto(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.elements = new LinkedList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

package com.company;

public class Equipo {
    private String nombre;
    private String modelo;

    public Equipo(String nombre, String modelo){
        this.nombre = nombre;
        this.modelo = modelo;
    }
    public Equipo(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

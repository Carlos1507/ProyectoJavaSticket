package com.company;

public class Cliente {
    private String nombre;
    private int dni;
    private int edad;
    private double consumo;
    private int cantidadVacunas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getCantidadVacunas() {
        return cantidadVacunas;
    }

    public void setCantidadVacunas(int cantidadVacunas) {
        this.cantidadVacunas = cantidadVacunas;
    }
}

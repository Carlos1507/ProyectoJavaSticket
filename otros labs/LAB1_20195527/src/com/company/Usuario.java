package com.company;

public class Usuario {
    private String nombre;
    private String apellido;
    private int codigoPUCP;
    private String email;
    private String condicion;
    private int edad;
    private int sueldo;
    private int anhoEgreso;
    private Actividad actividad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoPUCP() {
        return codigoPUCP;
    }

    public void setCodigoPUCP(int codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnhoEgreso() {
        return anhoEgreso;
    }

    public void setAnhoEgreso(int anhoEgreso) {
        this.anhoEgreso = anhoEgreso;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
}

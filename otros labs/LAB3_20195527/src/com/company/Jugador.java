package com.company;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private String apodo;
    private String apellidoPaterno;
    Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void registrar(){

        loopNombreJugador: while (true) {
            System.out.print("Ingrese el nombre: ");
            String nombreJug = sc.nextLine();
            if (nombreJug.length() == 0) {
                System.out.println("Debe registrar un nombre");
                continue loopNombreJugador;
            } else {
                this.nombre = nombreJug;
                break loopNombreJugador;
            }
        }
        loopApodoJugador: while (true) {
            System.out.print("Ingrese el apodo: ");
            String apodoJug = sc.nextLine();
            if (apodoJug.length() == 0) {
                System.out.println("Debe registrar un apodo");
                continue loopApodoJugador;
            } else {
                this.apodo = apodoJug;
                break loopApodoJugador;
            }
        }
        loopApellidoJugador: while (true) {
            System.out.print("Ingrese el apellido paterno: ");
            String apellidoJug = sc.nextLine();
            if (apellidoJug.length() == 0) {
                System.out.println("Debe registrar un apellido paterno");
                continue loopApellidoJugador;
            } else {
                this.apellidoPaterno = apellidoJug;
                break loopApellidoJugador;
            }
        }
    }
    public void mostrarDescripcion(){
        System.out.println("------------------------------------");
        System.out.println("Jugador: "+nombre+" '"+apodo+"' "+apellidoPaterno);
    }
}

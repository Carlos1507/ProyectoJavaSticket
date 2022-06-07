package com.company;

import java.util.Scanner;

public class Arquero extends Jugador{
    private int reaccionDisparos;
    private int capacidadVuelo;
    Scanner sc = new Scanner(System.in);
    public int getReaccionDisparos() {
        return reaccionDisparos;
    }

    public void setReaccionDisparos(int reaccionDisparos) {
        this.reaccionDisparos = reaccionDisparos;
    }

    public int getCapacidadVuelo() {
        return capacidadVuelo;
    }

    public void setCapacidadVuelo(int capacidadVuelo) {
        this.capacidadVuelo = capacidadVuelo;
    }
    public void registrar(){
        super.registrar();
        System.out.print("Ingrese reaccion a disparo: ");
        this.reaccionDisparos = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese capacidad de vuelo: ");
        this.capacidadVuelo = Integer.parseInt(sc.nextLine());
    }
    public void mostrarDescripcion(){
        super.mostrarDescripcion();
        System.out.println("Reacción a disparo: "+reaccionDisparos);
        System.out.println("Capacidad de vuelo: "+capacidadVuelo);
    }
}

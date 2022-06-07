package com.company;

import java.util.Scanner;

public class Atacante extends Jugador{
    private int precisionDisparo;
    private int potenciaDisparo;
    Scanner sc = new Scanner(System.in);

    public int getPrecisionDisparo() {
        return precisionDisparo;
    }

    public void setPrecisionDisparo(int precisionDisparo) {
        this.precisionDisparo = precisionDisparo;
    }

    public int getPotenciaDisparo() {
        return potenciaDisparo;
    }

    public void setPotenciaDisparo(int potenciaDisparo) {
        this.potenciaDisparo = potenciaDisparo;
    }
    public void registrar(){
        super.registrar();
        System.out.print("Ingrese precision: ");
        this.precisionDisparo = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese potencia: ");
        this.potenciaDisparo = Integer.parseInt(sc.nextLine());
    }
    public void mostrarDescripcion(){
        super.mostrarDescripcion();
        System.out.println("Precisión de disparo: "+precisionDisparo);
        System.out.println("Potencia de disparo: "+potenciaDisparo);
    }
}

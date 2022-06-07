package com.company;

import java.util.Scanner;

public class Defensor extends Jugador {
    private int alcanceBarrida;
    private int capacidadDefensiva;
    Scanner sc = new Scanner(System.in);
    public int getAlcanceBarrida() {
        return alcanceBarrida;
    }

    public void setAlcanceBarrida(int alcanceBarrida) {
        this.alcanceBarrida = alcanceBarrida;
    }

    public int getCapacidadDefensiva() {
        return capacidadDefensiva;
    }

    public void setCapacidadDefensiva(int capacidadDefensiva) {
        this.capacidadDefensiva = capacidadDefensiva;
    }
    public void registrar(){
        super.registrar();
        System.out.print("Ingrese alcance de barrida: ");
        this.alcanceBarrida = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese capacidad defensiva: ");
        this.capacidadDefensiva = Integer.parseInt(sc.nextLine());
    }
    public void mostrarDescripcion(){
        super.mostrarDescripcion();
        System.out.println("Alcance de barrida: "+alcanceBarrida);
        System.out.println("Capacidad Defensiva: "+capacidadDefensiva);
    }
}

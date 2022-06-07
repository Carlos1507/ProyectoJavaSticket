package com.company.bean.equipos;

import java.util.Scanner;

public class Computadora {
    private String marca;
    private String procesador;
    private String tamanoDisco;
    private int cantidadMemoria;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTamanoDisco() {
        return tamanoDisco;
    }

    public void setTamanoDisco(String tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void registro(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" -- Computadora --");
        System.out.print("Ingrese la Marca : ");
        this.setMarca(scan.nextLine());
        System.out.print("Ingrese el Procesador : ");
        this.setProcesador(scan.nextLine());
        System.out.print("Tamaño de Disco (GB) : ");
        this.setTamanoDisco(scan.nextLine());
        System.out.print("Tamaño de Memoria (GB): ");
        this.setCantidadMemoria(Integer.parseInt(scan.nextLine()));
        System.out.print("Ingrese el Precio (Soles): ");
        this.setPrecio(Double.parseDouble(scan.nextLine()));
    }
    public void reporte() {
        System.out.println("+----------------------------+");
        System.out.println("|         Computadora        |");
        System.out.println("   Marca : " + this.getMarca());
        System.out.println("   Procesador : " + this.getProcesador());
        System.out.println("   Tamaño de Disco (GB) : " + this.getTamanoDisco());
        System.out.println("   Tamaño de Memoria (GB) : " + this.getCantidadMemoria());
        System.out.println("   Precio : " + this.getPrecio());
        System.out.println("+----------------------------+");
    }
}

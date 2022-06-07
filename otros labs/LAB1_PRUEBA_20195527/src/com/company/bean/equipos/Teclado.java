package com.company.bean.equipos;

import java.util.Scanner;

public class Teclado {
    private String marca;
    private String color;
    private boolean inalambrico;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void registro(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" -- Teclado --");
        System.out.print("Ingrese la Marca : ");
        this.setMarca(scan.nextLine());
        System.out.print("Ingrese el Color : ");
        this.setColor(scan.nextLine());
        System.out.print("¿Es inalámbrico? No(0)/Si(1) : ");
        int option = Integer.parseInt(scan.nextLine());
        if (option == 0){
            this.setInalambrico(false);
        }else{
            this.setInalambrico(true);
        }
        System.out.print("Ingrese el Precio (Soles): ");
        this.setPrecio(Double.parseDouble(scan.nextLine()));
    }

    public void reporte() {
        System.out.println("+----------------------------+");
        System.out.println("|           Teclado          |");
        System.out.println("   Marca : " + this.getMarca());
        System.out.println("   Color : " + this.getColor());
        System.out.println("   Inalambrico : " + (this.isInalambrico()? "Si" : "No"));
        System.out.println("   Precio : " + this.getPrecio());
        System.out.println("+----------------------------+");
    }

}

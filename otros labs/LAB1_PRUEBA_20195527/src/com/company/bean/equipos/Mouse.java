package com.company.bean.equipos;

import java.util.Scanner;

public class Mouse {
    private String marca;
    private String color;
    private boolean inalambrico;
    private Double precio = 0.0;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public boolean getInalambrico() { return inalambrico; }

    public void setInalambrico(boolean inalambrico) { this.inalambrico = inalambrico; }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void reporte() {
        System.out.println("+----------------------------+");
        System.out.println("|           Mouse            |");
        System.out.println("   Marca : " + this.getMarca());
        System.out.println("   Color : " + this.getColor());
        System.out.println("   Inalambrico : " + (this.getInalambrico()?"Si":"No"));
        System.out.println("   Precio : " + this.getPrecio());
        System.out.println("+----------------------------+");
    }

    public void registro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" -- Mouse --");
        System.out.print("Ingrese la Marca : ");
        this.setMarca(scanner.nextLine());
        System.out.print("Ingrese el Color : ");
        this.setColor(scanner.nextLine());
        System.out.print("¿Es inalambrico? No(0)/Si(1) : ");
        int option = Integer.parseInt(scanner.nextLine());
        if(option == 1) {
            this.setInalambrico(true);
        }
        else
        {
            this.setInalambrico(false);
        }
        System.out.print("Ingrese el Precio (Soles): ");
        this.setPrecio(Double.parseDouble(scanner.nextLine()));
    }

}

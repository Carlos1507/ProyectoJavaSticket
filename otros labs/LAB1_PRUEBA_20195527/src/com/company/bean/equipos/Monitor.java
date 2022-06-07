package com.company.bean.equipos;

import java.util.Scanner;

public class Monitor {
    private String marca;
    private String tamanoPantalla;
    private String color;
    private Double precio = 0.0;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanoPantalla() { return tamanoPantalla; }

    public void setTamanoPantalla(String tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void reporte() {
        System.out.println("+----------------------------+");
        System.out.println("|           Monitor          |");
        System.out.println("   Marca : " + this.getMarca());
        System.out.println("   Tamaño Pantalla : " + this.getTamanoPantalla());
        System.out.println("   Color : " + this.getColor());
        System.out.println("   Precio : " + this.getPrecio());
        System.out.println("+----------------------------+");
    }

    public void registro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" -- Monitor --");
        System.out.print("Ingrese la Marca : ");
        this.setMarca(scanner.nextLine());
        System.out.print("Ingrese el tamaño de Pantalla : ");
        this.setTamanoPantalla(scanner.nextLine());
        System.out.print("Ingrese el Color : ");
        this.setColor(scanner.nextLine());
        System.out.print("Ingrese el Precio (Soles): ");
        this.setPrecio(Double.parseDouble(scanner.nextLine()));
    }


}

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("qué tal?");
        int x = 5;
        int y = 6;
        String texto = "este es un texto";
        int c = x + y;
        int d = x - y;
        String otroTexto = "otro texto";
        String nuevoTexto = texto + " " + otroTexto;
        String prueba = texto + c + d + x + y;
        System.out.println(prueba);

        float X = 5f;
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona pablito = new Persona();

        p1.nombre = "Daniel";
        System.out.println(p1.nombre);

        p1.altura = 1.74f;
        p1.nombre = "Diego";
        p1.comer();
        pablito.comer();
    }
}
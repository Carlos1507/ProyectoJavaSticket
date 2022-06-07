package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("bienvenidos");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");

        String nombre = scanner.nextLine();
        System.out.println("El nombre ingresado fue: " + nombre);

        System.out.print("Ingresa un número: ");
        String numeroStr = scanner.nextLine();
        int numero = Integer.parseInt(numeroStr);
        System.out.println("El número ingresado fue "+ ++numero);
    }
}

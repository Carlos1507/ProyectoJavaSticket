package com.lab4;

import com.lab4.bean.Pasaje;
import com.lab4.excepciones.DniException;
import com.lab4.excepciones.LugaresException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Lista de personas con antecedentes y no pueden comprar boletos
        String[] dniBaneados = {"75407284","75603120","60255128","40845023","50874367"};

        //Lista de lugares disponibles para comparar vuelos
        String[] lugaresDisponibles = {"Rio de Janeiro", "Tokio"," Pucallpa", "Arequipa", "Ayacucho", "Bogota", "Canada"};

        System.out.println("\n***********************Bienvenido a TeleViajero************************\n");

        Pasaje pasaje = new Pasaje();

        Boolean fin = true;

        while (fin){

            String menu = "\nElige la acción que desea realizar:\n" +
                    "1. Registrar un viaje\n" +
                    "2. Resumen de datos ingresados \n" +
                    "3. Salir\n" +
                    "Opción: ";

            System.out.print(menu);

            int opcion = Integer.valueOf(sc.nextLine());

                switch (opcion){

                }
        }

    }


    public static String validarDni(String[] dniBaneados){


        //Ingresar codigo para validar Dni

    }

    public static String validarLugar(String[] lugaresPermitidos){


        //Ingresar codigo para validar Lugar

    }
}

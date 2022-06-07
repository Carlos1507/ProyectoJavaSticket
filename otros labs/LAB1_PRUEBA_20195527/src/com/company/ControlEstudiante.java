package com.company;

import com.company.bean.Estudiante;
import com.company.bean.equipos.Computadora;
import com.company.bean.equipos.Monitor;
import com.company.bean.equipos.Mouse;
import com.company.bean.equipos.Teclado;

import java.util.Scanner;

public class ControlEstudiante {
    public void registrarEstudiante (Estudiante estudiante){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------\n");
        boolean estudianteNulo = (estudiante.getNombre() == null) && (estudiante.getApellido() == null) &&
                (estudiante.getCodigoPUCP() == null) && (estudiante.getCorreoPUCP() == null) && (estudiante.getCicloIngreso() == null);
        if (estudianteNulo){
            System.out.println("Ingrese Código PUCP: ");
            estudiante.setCodigoPUCP(sc.nextLine());
            System.out.println("Ingrese Nombre: ");
            estudiante.setNombre(sc.nextLine());
            System.out.println("Ingrese Apellido: ");
            estudiante.setApellido(sc.nextLine());
            System.out.println("Ingrese Ciclo de Ingreso: ");
            estudiante.setCicloIngreso(sc.nextLine());
            System.out.println("Ingrese correo PUCP: ");
            estudiante.setCorreoPUCP(sc.nextLine());
        } else {
            System.out.println("Ya se tiene registrado un estudiante");
        }
    }

    public void verInfoEstudiante (Estudiante estudiante){
        System.out.println("-----------------------------------");
        System.out.println("");
        boolean estudianteNulo = (estudiante.getNombre() == null) && (estudiante.getApellido() == null) &&
                (estudiante.getCodigoPUCP() == null) && (estudiante.getCorreoPUCP() == null) && (estudiante.getCicloIngreso() == null);
        if (estudianteNulo){
            System.out.println("************************************\n");
            System.out.println("No se tiene registrado un estudiante\n");
            System.out.println("************************************");
        } else {
            System.out.println("*-  Información del estudiante  -*");
            System.out.println("----------------------------------");
            System.out.println("Código de Alumno: "+ estudiante.getCodigoPUCP());
            System.out.println("Nombre: "+ estudiante.getNombre());
            System.out.println("Apellido: "+ estudiante.getApellido());
            System.out.println("Correo: "+estudiante.getCorreoPUCP());
        }
    }

    public void borrarEstudiante(Estudiante estudiante){
        estudiante.setNombre(null);
        estudiante.setApellido(null);
        estudiante.setCorreoPUCP(null);
        estudiante.setCicloIngreso(null);
        estudiante.setCodigoPUCP(null);
        estudiante.setComputadora(new Computadora());
        estudiante.setMouse(new Mouse());
        estudiante.setTeclado(new Teclado());
        estudiante.setMonitor(new Monitor());
        System.out.println("-----------------------------------");
        System.out.println("Borrado del Registro de Estudiante Completado");

    }

}


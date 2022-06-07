package com.company;

import com.company.bean.Estudiante;
import com.company.bean.equipos.Computadora;
import com.company.bean.equipos.Monitor;
import com.company.bean.equipos.Mouse;
import com.company.bean.equipos.Teclado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ControlEstudiante control1 = new ControlEstudiante();
        Estudiante estudiante1 = new Estudiante();
        whileMenu:
        do{
            Scanner scanner = new Scanner(System.in);
            // Menú de opciones
            System.out.println("\n+++++++++++++++++++++++++++++++++++");
            System.out.println("|              Menú               |");
            System.out.println("| [1]  Registrar Estudiante       |");
            System.out.println("| [2]  Información Registrada     |");
            System.out.println("| [3]  Borrar Registro Estudiante |");
            System.out.println("| [4]  Costo Total                |");
            System.out.println("| [5]  Salir                      |");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.print("Ingrese opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1){
                System.out.println("Registrar estudiante");
                control1.registrarEstudiante(estudiante1);
                System.out.println("¿Desea comprar un Computador? (Si/No): ");
                String option1 = scanner.nextLine();
                System.out.println(option1);
                if (option1.equals("Si")){
                    Computadora computadora = new Computadora();
                    estudiante1.setComputadora(computadora);
                    estudiante1.getComputadora().registro();
                }
                else{
                    Computadora computadora = null;
                }
                System.out.println("¿Desea comprar un Monitor? (Si/No): ");
                String option2 = scanner.nextLine();
                if (option2.equals("Si")){
                    Monitor monitor = new Monitor();
                    estudiante1.setMonitor(monitor);
                    estudiante1.getMonitor().registro();
                }
                else{
                    Monitor monitor = null;
                }
                System.out.println("¿Desea comprar un Teclado? (Si/No): ");
                String option3 = scanner.nextLine();
                if (option3.equals("Si")){
                    Teclado teclado = new Teclado();
                    estudiante1.setTeclado(teclado);
                    estudiante1.getTeclado().registro();
                }
                else{
                    Teclado teclado = null;
                }
                System.out.println("¿Desea comprar un Mouse? (Si/No): ");
                String option4 = scanner.nextLine();
                if (option4.equals("Si")){
                    Mouse mouse = new Mouse();
                    estudiante1.setMouse(mouse);
                    estudiante1.getMouse().registro();
                }
                else{
                    Mouse mouse = null;
                }
            } else if (opcion == 2){
                System.out.println("Información Registrada");
                boolean estudianteNulo = (estudiante1.getNombre() == null) && (estudiante1.getApellido() == null) &&
                        (estudiante1.getCodigoPUCP() == null) && (estudiante1.getCorreoPUCP() == null) && (estudiante1.getCicloIngreso() == null);
                control1.verInfoEstudiante(estudiante1);
                if (!estudianteNulo){
                    if (estudiante1.getComputadora() != null)
                        estudiante1.getComputadora().reporte();
                    if (estudiante1.getMonitor()!= null)
                        estudiante1.getMonitor().reporte();
                    if (estudiante1.getTeclado()!= null)
                        estudiante1.getTeclado().reporte();
                    if (estudiante1.getMouse()!= null)
                        estudiante1.getMouse().reporte();
                }
            } else if (opcion == 3){
                System.out.println("Borrar Registro Estudiante");
                control1.borrarEstudiante(estudiante1);
            } else if (opcion == 4){
                System.out.println("Costo Total");
                System.out.println("-----------------------------------");
                System.out.println("***** Costo Total : s/ "+ Tools.costoTotal(estudiante1)+" *****");
            } else if (opcion == 5){
                System.out.println("Salir");
                break whileMenu;
            } else if (opcion == 9){
                System.out.println("--- Cerrando programa ---");
                break whileMenu;
            } else{
                System.out.println("Ingrese una opción válida");
            }
        } while (true);
    }
}

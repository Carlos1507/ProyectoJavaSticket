package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean ingresoDatos = false;
        final int anhoActual = 2022;
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Actividad actividad = new Actividad();
        usuario.setActividad(actividad);
        loopPrincipal: do{
            System.out.println("*****  BIENVENIDOS AL LABORATORIO 1  *****");
            if (ingresoDatos == false) {
                System.out.println("Usted aún no se ha registrado, ingrese sus datos personales");
                System.out.print("->Ingrese su nombre: ");
                usuario.setNombre(sc.nextLine());
                System.out.print("->Ingrese su apellido: ");
                usuario.setApellido(sc.nextLine());
                System.out.print("->Ingrese su código PUCP: ");
                usuario.setCodigoPUCP(Integer.parseInt(sc.nextLine()));
                System.out.print("->Ingrese su mail PUCP: ");
                usuario.setEmail(sc.nextLine());
                System.out.print("->Ingrese su condición (Alumno o egresado): ");
                String condicionUsario = sc.nextLine();
                System.out.print("->Ingrese su edad: ");
                usuario.setEdad(Integer.parseInt(sc.nextLine()));
                if (condicionUsario.equalsIgnoreCase("alumno")) {
                    usuario.setCondicion("Alumno");
                    usuario.setSueldo(0);
                    usuario.setAnhoEgreso(0);
                } else {
                    usuario.setCondicion("Egresado");
                    System.out.print("->Ingrese su sueldo: ");
                    usuario.setSueldo(Integer.parseInt(sc.nextLine()));
                    System.out.print("->Ingrese anho de egreso: ");
                    usuario.setAnhoEgreso(Integer.parseInt(sc.nextLine()));
                }
                if ((usuario.getNombre() != null) && (usuario.getApellido() != null))
                    ingresoDatos = true;

            }
            else {
                System.out.print("->Ingrese su codigo PUCP: ");
                int codigoUsuario = Integer.parseInt(sc.nextLine());
                if (codigoUsuario == usuario.getCodigoPUCP()) {
                    loopOpciones: do {
                        System.out.println("\nBienvenido " + usuario.getNombre() + usuario.getApellido());
                        System.out.println("Escoja una de las siguientes opciones: ");
                        System.out.println("opción (1).- Registrar actividad a la cual apoyará");
                        System.out.println("opción (2).- Diagnóstico de apoyo");
                        System.out.println("opción (3).- Ver mi resumen");
                        System.out.println("opción (4).- Salir del menu");
                        System.out.print("->Ingrese su opción: ");
                        int opcion = Integer.parseInt(sc.nextLine());

                        if (opcion == 1) {
                            loopActividades: do{
                                System.out.print("->Ingrese el nombre de la actividad a apoyar: ");
                                String actividadApoyar = sc.nextLine();
                                boolean actividadValida = actividadApoyar.equals("futsal") ||
                                                          actividadApoyar.equals("voley") ||
                                                          actividadApoyar.equals("4xjonca") ||
                                                          actividadApoyar.equals("glotones") ||
                                                          actividadApoyar.equals("basquet");
                                if (actividadValida){
                                    actividad.setNombre(actividadApoyar);
                                    System.out.print("->Ingrese su cargo (Barras o jugar): ");
                                    actividad.setCargo(sc.nextLine());
                                    System.out.print("->Ingrese sus horas de apoyo a la fibra: ");
                                    actividad.setHorasApoyar(Integer.parseInt(sc.nextLine()));
                                    if (usuario.getCondicion().equals("Egresado")){
                                        System.out.print("->Ingrese su diezmo: ");
                                        actividad.setDiezmo(Integer.parseInt(sc.nextLine()));
                                    }else{
                                        System.out.print("->¿Cuánto desea donar a la fibra?: ");
                                        actividad.setDiezmo(Integer.parseInt(sc.nextLine()));
                                    }
                                    break loopActividades;
                                }else{
                                    System.out.println("*** Ingrese un nombre de actividad correcto");
                                    continue;
                                }
                            } while(true);
                        } else if (opcion == 2) {
                            if (usuario.getCondicion().equals("Egresado")){
                                int diezmoIngresado = usuario.getActividad().getDiezmo();
                                int sumaCifras =0;
                                int codigo = usuario.getCodigoPUCP();
                                while(codigo > 0) {
                                    sumaCifras += codigo % 10;
                                    codigo /= 10;
                                }
                                int factor = usuario.getEdad() + sumaCifras;
                                int diezmoDeseado = (int) ((usuario.getSueldo()*0.1) + factor*(anhoActual - usuario.getAnhoEgreso()));
                                if (diezmoIngresado > diezmoDeseado) {
                                    actividad.setDiezmo(diezmoDeseado);
                                }
                                else {
                                    actividad.setDiezmo(diezmoIngresado);
                                }
                                double diferenciaDiagnostico = Math.abs(diezmoDeseado - diezmoIngresado)*100/diezmoDeseado;
                                if (diferenciaDiagnostico<10)
                                    System.out.println("Es un hincha de nacimiento, se agradece profundamente la donación realizada a la fibra de corazón.");
                                else if (11<diferenciaDiagnostico && diferenciaDiagnostico<30)
                                    System.out.println("Es un Hincha, la fibra está con usted y usted con la fibra.");
                                else if (31<diferenciaDiagnostico && diferenciaDiagnostico<50)
                                    System.out.println("Necesita alentar más a la fibra, pero la fibra está conforme con su apoyo actual.");
                                else if (51<diferenciaDiagnostico && diferenciaDiagnostico<70)
                                    System.out.println("Necesita encariñarse más con la fibra, sabemos que el próximo año le pondrá más apoyo.");
                                else if (71<diferenciaDiagnostico && diferenciaDiagnostico<99)
                                    System.out.println("Es un pecho frío, pero se le agradece la colaboración.");
                                else
                                    System.out.println("No tiene comentarios, puesto que no apoyó a la fibra.");
                            }else{
                                System.out.println("Usted es un alumno, apoyó con "+usuario.getActividad().getDiezmo()+
                                        " soles, gracias por apoyar a la fibra");
                            }
                        } else if (opcion == 3) {
                            System.out.println("->Nombre completo: " +usuario.getNombre()+" "+usuario.getApellido());
                            System.out.println("Edad: " +usuario.getEdad());
                            System.out.println("Codigo PUCP: " + usuario.getCodigoPUCP());
                            System.out.println("Apoyo a la actividad de: "+usuario.getActividad().getNombre()+
                                               " como parte de "+ usuario.getActividad().getCargo());
                            System.out.println("Además apoyó a la fibra con "+usuario.getActividad().getHorasApoyar()+ "horas semanales");
                        } else if (opcion == 4) {
                            break loopPrincipal;
                        }
                    }while(true);
                }
                else
                    System.out.println("Usuario no registrado");
            }
        } while(ingresoDatos);
    }
}

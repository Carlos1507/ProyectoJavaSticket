package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Bebida> listaBebidas = new ArrayList<>();

        loopPrincipal: while(true){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("|                  Menu                    |");
            System.out.println("| 1 <- Registrar nuevo cliente             |");
            System.out.println("| 2 <- Buscar detalle del cliente por DNI  |");
            System.out.println("| 3 <- Añadir bebida a cliente             |");
            System.out.println("| 4 <- Añadir nueva bebida                 |");
            System.out.println("| 5 <- Salir                               |");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

            System.out.print("Ingrese la opción: ");
            int opcMenuPrincipal = Integer.parseInt(sc.nextLine());

            if(opcMenuPrincipal == 1){
                Cliente cliente = new Cliente();
                listaClientes.add(cliente);
                System.out.println("Registrar nuevo cliente");
                loopNomCliente: do{
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreIngresado = sc.nextLine();
                    if (nombreIngresado.equals("")){
                        System.out.println("Tiene que colocar un nombre");
                        continue;
                    }else{
                        cliente.setNombre(nombreIngresado);
                        break loopNomCliente;
                    }
                }while(true);

                loopDniCliente: do{
                    System.out.print("Ingrese el dni del cliente: ");
                    String dniIngresado = sc.nextLine();
                    if (dniIngresado.equals("") || dniIngresado.length() != 8){
                        System.out.println("Dni invalido");
                        continue;
                    }else{
                        cliente.setDni(Integer.parseInt(dniIngresado));
                        break loopDniCliente;
                    }
                }while(true);

                loopEdadCliente: do{
                    System.out.print("Ingrese la edad del cliente (tiene que ser mayor de edad): ");
                    String edadIngresada = sc.nextLine();
                    if (edadIngresada.equals("") || Integer.parseInt(edadIngresada)<18){
                        System.out.println("Datos incorrectos");
                        continue;
                    }else{
                        cliente.setEdad(Integer.parseInt(edadIngresada));
                        break loopEdadCliente;
                    }
                }while(true);

                loopVacunas: do{
                    System.out.print("Ingrese la cantidad de vacunas de " + cliente.getNombre() + " : ");
                    String vacunasIngresadas = sc.nextLine();
                    if (vacunasIngresadas.equals("") || Integer.parseInt(vacunasIngresadas)<3){
                        System.out.println("Cantidad de vacunas insuficientes para poder acceder al local");
                        continue;
                    }else{
                        cliente.setCantidadVacunas(Integer.parseInt(vacunasIngresadas));
                        break loopVacunas;
                    }
                }while(true);
                cliente.setConsumo(40.0);
                System.out.println("Cliente registro satisfactoriamente, su codigo es "+cliente.getDni());
            }else if(opcMenuPrincipal == 2){
                System.out.println("Buscar detalles del cliente por DNI");
                busqCliente: while(true) {
                    System.out.print("Ingrese el dni del cliente que quiere buscar: ");
                    String dniIngres = sc.nextLine();
                    if (dniIngres.equals("") || dniIngres.length() != 8) {
                        System.out.println("Datos ingresados incorrectos");
                        continue busqCliente;
                    } else {
                        int dniBuscar = Integer.parseInt(dniIngres);
                        System.out.println(dniBuscar);
                        for (int i = 0; i < listaClientes.size(); i++) {
                            
                            if (listaClientes.get(i).getDni() == dniBuscar) {
                                System.out.println("Se encontró el cliente, sus datos son los siguientes: ");
                                System.out.println("Nombre: " + listaClientes.get(i).getNombre());
                                System.out.println("Dni: " + listaClientes.get(i).getDni());
                                System.out.println("Edad: " + listaClientes.get(i).getEdad());
                                System.out.println("Consumo: S/" + listaClientes.get(i).getConsumo());
                                System.out.println("Cantidad de vacunas: " + listaClientes.get(i).getCantidadVacunas());
                                break busqCliente;
                            } else {
                                System.out.println("El cliente no se encuentra registrado");
                                continue busqCliente;
                            }
                        }
                    }
                }
            }else if(opcMenuPrincipal == 3){
                System.out.println("Añadir bebida a cliente");
                eleccionBebida: while(true) {
                    System.out.print("Indique el codigo(dni) del cliente que desea comprar la bebida: ");
                    String dniComprar = sc.nextLine();
                    if (dniComprar.equals("") || dniComprar.length() != 8) {
                        System.out.println("Datos incorrectos");
                        continue eleccionBebida;
                    } else {
                        int dniBusc = Integer.parseInt(dniComprar);
                        for (int k = 0; k < listaClientes.size(); k++) {
                            if (listaClientes.get(k).getDni() == dniBusc) {
                                System.out.println("Se encuentran las siguientes bebidas: ");
                                for (int j = 0; j < listaBebidas.size(); j++) {
                                    Bebida bebida = listaBebidas.get(j);
                                    if (bebida.getCantidad() > 0) {
                                        System.out.println((j + 1) + ") " + bebida.getNombre() + " : S/ " + bebida.getPrecio());
                                    }
                                }
                                System.out.print("Indique el número de bebida a agregar: ");
                                int opcionBebida = Integer.parseInt(sc.nextLine());
                                Bebida bebidaSelec = listaBebidas.get(opcionBebida - 1);
                                bebidaSelec.setCantidad(bebidaSelec.getCantidad() - 1);
                                listaClientes.get(k).setConsumo(listaClientes.get(k).getConsumo() + bebidaSelec.getPrecio());
                                System.out.println("Se agregó el cargo de la bebida al cliente");
                                break eleccionBebida;
                            }else{
                                System.out.println("No se encontró a un cliente con este código");
                                continue eleccionBebida;
                            }
                        }
                    }
                }
            }else if(opcMenuPrincipal == 4){
                Bebida bebida = new Bebida();
                listaBebidas.add(bebida);
                System.out.println("Añadir nueva bebida");
                System.out.print("Ingrese el nombre de la bebida: ");
                bebida.setNombre(sc.nextLine());
                System.out.print("Ingrese el precio de "+bebida.getNombre()+" : ");
                bebida.setPrecio(Integer.parseInt(sc.nextLine()));
                System.out.print("Ingrese el stock: ");
                bebida.setCantidad(Integer.parseInt(sc.nextLine()));
                System.out.println("Se agregó la bebida correctamente");
            }else if(opcMenuPrincipal == 5){
                break loopPrincipal;
            }else{
                System.out.println("Ingrese una opción válida");
            }

        }
    }
}

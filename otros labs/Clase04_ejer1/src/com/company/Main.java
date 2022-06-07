package com.company;

import com.company.dispositivos.Pc;
import com.company.dispositivos.Puerto;
import com.company.dispositivos.Switch;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NetworkManager> listaRedes= new ArrayList<>();
        loopPrincipal: while(true) {
            System.out.println("---- Bienvenido ----");
            System.out.print("Ingrese el nombre de su red: ");
            String redIngresada = sc.nextLine();
            loopPedirRed: for (int i=0; i<listaRedes.size(); i++){
                if (redIngresada.equals(listaRedes.get(i).getNombreRed())) {
                    System.out.println("La red ya existe!");
                    continue loopPrincipal;
                }
            }
            NetworkManager network = new NetworkManager();
            ArrayList<Vlan> listaVlans = new ArrayList<>();
            ArrayList<Equipo> listaEqDispon = new ArrayList<>();
            ArrayList<Equipo> listaEqUso = new ArrayList<>();
            listaRedes.add(network);
            network.setListaVlan(listaVlans);
            network.setListaEquiposDisponibles(listaEqDispon);
            network.setListaEquiposEnUso(listaEqUso);
            loopMenu: while(true){
                // Menú
                System.out.println("-----------------------");
                System.out.println("1.- Agregar Vlan");
                System.out.println("2.- Agregar Pc");
                System.out.println("3.- Agregar Switch");
                System.out.println("4.- Borrar Vlan");
                System.out.println("5.- Borrar Pc");
                System.out.println("6.- Reporte");
                System.out.println("0.- Salir");
                System.out.print("--> Indique su opción: ");
                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1" -> {
                        System.out.print("Ingrese el nombre de la Vlan: ");
                        String vlanIngresada = sc.nextLine();
                        loopPedirVlan: for (int i=0; i<listaVlans.size(); i++){
                            if (vlanIngresada.equals(listaVlans.get(i).getNombre())) {
                                System.out.println("La Vlan ya existe!");
                                continue loopMenu;
                            }
                        }
                        Vlan vlan = new Vlan();
                        listaVlans.add(vlan);
                        vlan.setNombre(vlanIngresada);

                        System.out.print("¿Permite correo? (S/N): ");
                        vlan.setPermiteCorreo(sc.nextLine().equalsIgnoreCase("s") ? true : false);
                        System.out.print("¿Permite facebook? (S/N): ");
                        vlan.setPermiteFacebook(sc.nextLine().equalsIgnoreCase("s") ? true : false);
                        System.out.print("¿Permite WoW? (S/N): ");
                        vlan.setPermiteWow(sc.nextLine().equalsIgnoreCase("s") ? true : false);
                        System.out.println("---- Vlan Agregada ----");
                    }
                    case "2" -> {
                        System.out.print("Ingrese el nombre del equipo: ");
                        String pcIngresada = sc.nextLine();
                        System.out.print("Ingrese el modelo del equipo: ");
                        String modeloIngresado = sc.nextLine();
                        loopPedirPc: for (int i=0; i<listaEqDispon.size(); i++){
                            if (pcIngresada.equals(listaEqDispon.get(i).getNombre())) {
                                System.out.println("La Pc ya existe!");
                                continue loopMenu;
                            }
                        }
                        Pc pc = new Pc();
                        listaEqDispon.add(pc);
                        pc.setNombre(pcIngresada);
                        pc.setModelo(modeloIngresado);
                    }
                    case "3" -> {
                        if (listaVlans.size()>0 && listaEqDispon.size()>0){
                            Switch switchNuevo = new Switch();
                            ArrayList<Puerto> listaPuertos = new ArrayList<>();
                            switchNuevo.setListaPuertos(listaPuertos);
                            System.out.print("Ingrese el nombre del equipo: ");
                            switchNuevo.setNombre(sc.nextLine());
                            System.out.print("Ingrese el modelo del equipo: ");
                            switchNuevo.setModelo(sc.nextLine());
                            loopAgregarPuertos: while(true) {
                                System.out.print("¿Agregar puertos al switch? (S/N): ");
                                if (sc.nextLine().equalsIgnoreCase("s")) {
                                    Puerto puerto = new Puerto();
                                    puerto.setNumeroPuertos(listaPuertos.size() + 1);
                                    System.out.print("Puerto agregado: " + puerto.getNumeroPuertos());
                                    System.out.println("Vlans disponibles: ");
                                    for (Vlan vlanSel : listaVlans) {
                                        System.out.println("VLAN: " + vlanSel.getNombre());
                                    }
                                    loopElegirVlan:
                                    while (true) {
                                        System.out.print("Ingrese el nombre de la Vlan: ");
                                        String vlanIng = sc.nextLine();
                                        loopBuscarVlan:
                                        for (int j = 0; j < listaVlans.size(); j++) {
                                            if (listaVlans.get(j).getNombre().equals(vlanIng)) {
                                                puerto.setVlan(listaVlans.get(j));
                                                break loopElegirVlan;
                                            }
                                        }
                                        System.out.println("La vlan no existe!");
                                    }

                                    System.out.println("Equipos disponibles: ");
                                    for (Equipo equipo : listaEqDispon) {
                                        if (equipo instanceof Pc) {
                                            Pc pcDisp = (Pc) equipo;
                                            System.out.println("PC --> Nombre: " + pcDisp.getNombre() + " / Modelo: " + pcDisp.getModelo());
                                        } else if (equipo instanceof Switch) {
                                            Switch swDisp = (Switch) equipo;
                                            System.out.println("Switch --> Nombre: " + swDisp.getNombre() + " / Modelo: " + swDisp.getModelo());
                                        }
                                    }
                                    loopElegirEquipo:
                                    while (true) {
                                        System.out.print("Ingrese el nombre del equipo: ");
                                        String eqIng = sc.nextLine();
                                        loopBuscarEquipo:
                                        for (int k = 0; k < listaEqDispon.size(); k++) {
                                            if (listaEqDispon.get(k).getNombre().equals(eqIng)) {
                                                puerto.setEquipo(listaEqDispon.get(k));
                                                listaEqUso.add(listaEqDispon.get(k));
                                                listaEqDispon.remove(k);
                                                break loopElegirEquipo;
                                            }
                                        }
                                        System.out.println("El equipo no existe!");
                                    }
                                    listaPuertos.add(puerto);
                                    System.out.println("--- Puerto agregado ----");
                                } else {
                                    break loopAgregarPuertos;
                                }
                            }
                            listaEqDispon.add(switchNuevo);
                            System.out.println("--- Switch agregado ----");
                        }else{
                            System.out.println("Debe registrar al menos una PC y una Vlan");
                        }
                    }
                    case "4" -> {
                        ArrayList<Switch> listaSwitches = new ArrayList<>();
                        ArrayList<Vlan> vlansLibres = new ArrayList<>();
                        for(int j=0; j<listaEqDispon.size();j++){
                            if (listaEqDispon.get(j) instanceof Switch){
                                Switch sw = (Switch) listaEqDispon.get(j);
                                listaSwitches.add(sw);
                            }
                        }
                        for(int j=0; j<listaEqUso.size();j++){
                            if (listaEqDispon.get(j) instanceof Switch){
                                Switch sw = (Switch) listaEqDispon.get(j);
                                listaSwitches.add(sw);
                            }
                        }

                        for (int i=0; i<listaVlans.size();i++){
                            for (int k=0; k<listaSwitches.size(); k++){
                                for (int v=0; v<listaSwitches.get(k).getListaPuertos().size();v++){
                                    Puerto p = listaSwitches.get(k).getListaPuertos().get(v);
                                    if (!p.getVlan().getNombre().equals(listaVlans.get(i))){
                                        vlansLibres.add(p.getVlan());
                                    }
                                }
                            }
                        }

                        for (Vlan vlan : vlansLibres){
                            System.out.println("VLAN: "+vlan.getNombre());
                        }


                    }
                    case "5" -> {
                        System.out.println("5");
                    }
                    case "6" -> {
                        System.out.println("6");
                    }
                    default -> {

                    }
                }
            }
        }
    }
}

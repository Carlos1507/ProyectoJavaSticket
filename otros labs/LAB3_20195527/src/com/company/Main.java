package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Campeonato campeonato = new Campeonato();
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        ArrayList<Partido> listaPartidos = new ArrayList<>();
        loopPrincipal: while(true){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("|                              Menu                               ");
            System.out.println("| (1) Registre un campeonato                                     |");
            System.out.println("| (2) Registre un equipo al campeonato                           |");
            System.out.println("| (3) Registre un partido al campeonato                          |");
            System.out.println("| (4) Mostrar las especificaciones de cada jugador del equipo    |");
            System.out.println("| (5) Mostrar equipos(s) con el mejor puntaje                    |");
            System.out.println("| (6) Salir                                                      |");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Ingrese opción : ");
            String opcion = sc.nextLine();

            //    ----------------  REGISTRAR CAMPEONATO  ---------------------
            if (opcion.equals("1")){
                if(campeonato.getNombre()==null) {
                    System.out.println("---------------------------------------");
                    System.out.println("Ingrese la información del campeonato");
                    System.out.println("---------------------------------------");
                    loopNombreCampeonato: while (true) {
                        System.out.print("Ingrese el nombre: ");
                        String nombreCampeonato = sc.nextLine();
                        if (nombreCampeonato.length() == 0) {
                            System.out.println("Debe registrar un nombre");
                            continue loopNombreCampeonato;
                        } else {
                            campeonato.setNombre(nombreCampeonato);
                            break loopNombreCampeonato;
                        }
                    }
                    loopPremioCampeonato: while (true) {
                        System.out.print("Ingrese el premio en soles: ");
                        String premioCampeonato = sc.nextLine();
                        if (premioCampeonato.length() == 0) {
                            System.out.println("Debe registrar un premio");
                            continue loopPremioCampeonato;
                        } else {
                            campeonato.setPremio(Double.parseDouble(premioCampeonato));
                            break loopPremioCampeonato;
                        }
                    }
                    // Una vez creado el campeonato, asigno la lista de equipos
                    // Pues no se puede elegir otra opción antes de crear un campeonato
                    campeonato.setEquipos(listaEquipos);
                    campeonato.setPartidos(listaPartidos);
                }else{
                    System.out.println("Ya existe un campeonato registrado");
                }
            //    ----------------  REGISTRAR EQUIPO  ---------------------
            }else if(opcion.equals("2")){
                if(campeonato.getNombre()!=null){
                    System.out.println("---------------------------------------");
                    System.out.println("Ingrese la información del equipo");
                    System.out.println("---------------------------------------");
                    Equipo equipo = new Equipo();
                    ArrayList<Jugador> listaJug = new ArrayList<>();
                    equipo.setJugadores(listaJug);
                    loopNombreEquipo: while (true) {
                        System.out.print("Ingrese el país: ");
                        String nombrePais = sc.nextLine();
                        if (nombrePais.length() == 0) {
                            System.out.println("Debe registrar un país");
                            continue loopNombreEquipo;
                        } else {
                            // Validar si el nombre del equipo existe previamente
                            for (Equipo eq : listaEquipos){
                                if(eq.getPais().equals(nombrePais)){
                                    System.out.println("Ingrese un equipo diferente\n");
                                    continue loopNombreEquipo;
                                }
                            }
                            equipo.setPais(nombrePais);
                            break loopNombreEquipo;
                        }
                    }
                    loopPuntosEquipo: while (true) {
                        System.out.print("Ingrese la cantidad de puntos del equipo: ");
                        String puntosEquipo = sc.nextLine();
                        if (puntosEquipo.length() == 0) {
                            System.out.println("Debe registrar una cantidad de puntos");
                            continue loopPuntosEquipo;
                        } else {
                            equipo.setPuntos(Integer.parseInt(puntosEquipo));
                            break loopPuntosEquipo;
                        }
                    }
                    loopJugadores: while(true) {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("|              Inserte jugador               ");
                        System.out.println("| (1) Arquero                               |");
                        System.out.println("| (2) Defensor                              |");
                        System.out.println("| (3) Atacante                              |");
                        System.out.println("| (4) Salir                                 |");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Ingrese opción : ");
                        String opcionJugador = sc.nextLine();
                        if (opcionJugador.equals("1")){
                            System.out.println("---------------------------------------");
                            System.out.println("Ingrese la información del arquero");
                            System.out.println("---------------------------------------");
                            Arquero arquero = new Arquero();
                            arquero.registrar();
                            listaJug.add(arquero);
                        }else if(opcionJugador.equals("2")){
                            System.out.println("---------------------------------------");
                            System.out.println("Ingrese la información del defensor");
                            System.out.println("---------------------------------------");
                            Defensor defensor = new Defensor();
                            defensor.registrar();
                            listaJug.add(defensor);
                        }else if(opcionJugador.equals("3")){
                            System.out.println("---------------------------------------");
                            System.out.println("Ingrese la información del atacante");
                            System.out.println("---------------------------------------");
                            Atacante atacante = new Atacante();
                            atacante.registrar();
                            listaJug.add(atacante);
                        }else if(opcionJugador.equals("4")){
                            break loopJugadores;
                        }
                    }
                    listaEquipos.add(equipo);
                }else{
                    System.out.println("No existe un campeonato registrado");
                }

            //    ----------------  REGISTRAR PARTIDO  ---------------------
            }else if(opcion.equals("3")){
                if(campeonato.getNombre()!=null){
                    if(listaEquipos.size()>2) {
                        Partido partido = new Partido();
                        listaPartidos.add(partido);
                        loopEquipoLocal:
                        while (true) {
                            System.out.print("Ingrese el nombre del equipo local: ");
                            String local = sc.nextLine();
                            if (local.length() == 0) {
                                System.out.println("Debe registrar un equipo");
                                continue loopEquipoLocal;
                            } else {
                                // Validar si el nombre del equipo está registrado
                                for (int i = 0; i < listaEquipos.size(); i++) {
                                    if (listaEquipos.get(i).getPais().equals(local)) {
                                        partido.setEquipoLocal(listaEquipos.get(i));
                                        break loopEquipoLocal;
                                    }
                                }
                                System.out.println("Ingrese un equipo válido");
                            }
                        }
                        loopEquipoVisitante:
                        while (true) {
                            System.out.print("Ingrese el nombre del equipo visitante: ");
                            String visitante = sc.nextLine();
                            if (visitante.length() == 0) {
                                System.out.println("Debe registrar un equipo");
                                continue loopEquipoVisitante;
                            } else {
                                // Validar si el nombre del equipo está registrado
                                for (int j = 0; j < listaEquipos.size(); j++) {
                                    if (listaEquipos.get(j).getPais().equals(visitante)) {
                                        if (partido.getEquipoLocal().getPais().equals(visitante)) {
                                            System.out.println("Ingrese un equipo diferente");
                                        } else {
                                            partido.setEquipoVisitante(listaEquipos.get(j));
                                            break loopEquipoVisitante;
                                        }
                                    }
                                }
                                System.out.println("Ingrese un equipo válido");
                            }
                        }
                        System.out.print("Ingrese el tipo de resultado: ");
                        partido.setTipoResultado(Integer.parseInt(sc.nextLine()));
                        if(partido.getTipoResultado()==1){
                            int puntosLocalAntes = partido.getEquipoLocal().getPuntos();
                            partido.getEquipoLocal().setPuntos(puntosLocalAntes+3);
                        }else if (partido.getTipoResultado()==2){
                            int puntosLocalAntes = partido.getEquipoLocal().getPuntos();
                            int puntosVisitanteAntes = partido.getEquipoVisitante().getPuntos();
                            partido.getEquipoLocal().setPuntos(puntosLocalAntes+1);
                            partido.getEquipoVisitante().setPuntos(puntosVisitanteAntes+1);
                        }else{
                            int puntosVisitanteAntes = partido.getEquipoVisitante().getPuntos();
                            partido.getEquipoVisitante().setPuntos(puntosVisitanteAntes+3);
                        }
                    }else{
                        System.out.println("Debe existir al menos 2 equipos");
                    }
                }else{
                    System.out.println("No existe un campeonato registrado");
                }
            //    ----------------  VER ESPECIFICACIONES JUGADORES  ---------------------
            }else if(opcion.equals("4")){
                if(campeonato.getNombre()!=null){
                    String paisSelec;
                    loopEleccionEquipo: while (true) {
                        System.out.print("Ingrese el nombre del país para conocer los jugadores: ");
                        String paisElegido = sc.nextLine();
                        if (paisElegido.length() == 0) {
                            System.out.println("Debe registrar un país");
                            continue loopEleccionEquipo;
                        } else {
                            // Validar si el nombre del equipo existe
                            for (Equipo eq : listaEquipos) {
                                if (eq.getPais().equals(paisElegido)) {
                                    paisSelec = paisElegido;
                                    break loopEleccionEquipo;
                                }
                            }
                        }
                    }
                    for (int i=0; i<listaEquipos.size();i++){
                        if(listaEquipos.get(i).getPais().equals(paisSelec)){
                            System.out.println("--------------------------------------");
                            System.out.println("Equipo");
                            for(int j=0;j<listaEquipos.get(j).getJugadores().size();j++){
                                listaEquipos.get(j).getJugadores().get(j).mostrarDescripcion();
                            }
                        }
                    }
                }else{
                    System.out.println("No existe un campeonato registrado");
                }
            }else if(opcion.equals("5")){
                if(campeonato.getNombre()!=null){
                    int mayorPuntos=0;
                    ArrayList<Equipo> equiposGanadores = new ArrayList<>();
                    for(Equipo equipo: listaEquipos){
                        if(equipo.getPuntos()>mayorPuntos){
                            mayorPuntos= equipo.getPuntos();
                        }
                    }
                    for (int i=0; i<listaEquipos.size();i++){
                        if(listaEquipos.get(i).getPuntos()==mayorPuntos){
                            equiposGanadores.add(listaEquipos.get(i));
                        }
                    }
                    if(equiposGanadores.size()==1){
                        System.out.println(listaEquipos.get(0).getPais()+" ha ganado el torneo con "+
                                listaEquipos.get(0).getPuntos()+ " puntos y ganó S/."+campeonato.getPremio());
                    }else{
                        String ganadores="";
                        for(int j=0; j<equiposGanadores.size();j++){
                            ganadores+=equiposGanadores.get(j).getPais();
                            if(j<equiposGanadores.size()-1)
                                ganadores+="-";
                        }
                        System.out.println("Los países "+ganadores +" han ganado el torneo con "+
                                mayorPuntos+ " puntos y se repartiran los S/."+campeonato.getPremio());
                    }
                }else{
                    System.out.println("No existe un campeonato registrado");
                }
            }else if(opcion.equals("6")){
                break loopPrincipal;
            }else{
                System.out.println("\nPor favor, ingrese una opción válida\n");
            }
        }
    }
}

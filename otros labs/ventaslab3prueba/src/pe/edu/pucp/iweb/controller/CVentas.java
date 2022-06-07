package pe.edu.pucp.iweb.controller;

import pe.edu.pucp.iweb.Main;
import pe.edu.pucp.iweb.model.bean.BVenta;
import pe.edu.pucp.iweb.model.bean.perifericos.Monitor;
import pe.edu.pucp.iweb.model.bean.perifericos.Mouse;
import pe.edu.pucp.iweb.model.bean.perifericos.Periferico;
import pe.edu.pucp.iweb.model.bean.perifericos.Teclado;
import pe.edu.pucp.iweb.model.bean.personas.EstudiantePUCP;
import pe.edu.pucp.iweb.model.bean.personas.Persona;
import pe.edu.pucp.iweb.model.bean.personas.TrabajadorPUCP;
import pe.edu.pucp.iweb.model.data.DVentas;

import java.util.ArrayList;
import java.util.Scanner;

public class CVentas {
    private DVentas dVentas;
    Scanner sc = new Scanner(System.in);
    public CVentas(DVentas dVentas) {
        this.dVentas = dVentas;
    }
    public void registrarCVenta(){
        DVentas dventas = new DVentas();
        Persona persona = new Persona();
        BVenta bVenta = new BVenta();
        ArrayList<Periferico> listaPerif = new ArrayList<>();
        bVenta.setListaPerifericos(listaPerif);
        System.out.print("Ingrese Nombre: ");
        persona.setNombre(sc.nextLine());
        System.out.print("Ingrese Apellido: ");
        persona.setApellido(sc.nextLine());
        System.out.print("Ingrese DNI: ");
        persona.setDni(sc.nextLine());

        System.out.print("¿Es estudiante PUCP? (Si/No): ");
        if (sc.nextLine().equalsIgnoreCase("si")){
            EstudiantePUCP estudiantePUCP = (EstudiantePUCP) persona;
            System.out.print("Ingrese Código PUCP: ");
            estudiantePUCP.setCodigoPUCP(sc.nextLine());
            System.out.println("Ingrese Correo PUCP: ");
            estudiantePUCP.setCorreoPUCP(sc.nextLine());
            System.out.println("Ingrese Ciclo de Ingreso: ");
            estudiantePUCP.setCicloIngreso(sc.nextLine());
            bVenta.setPersona(estudiantePUCP);
        }else{
            System.out.print("¿Es trabajador PUCP? (Si/No): ");
            if (sc.nextLine().equalsIgnoreCase("Si")){
                TrabajadorPUCP trabajadorPUCP = (TrabajadorPUCP) persona;
                System.out.print("Ingrese Código PUCP: ");
                trabajadorPUCP.setCodigoPUCP(sc.nextLine());
                System.out.println("Ingrese Correo PUCP: ");
                trabajadorPUCP.setCorreoPUCP(sc.nextLine());
                System.out.println("Ingrese Unidad: ");
                trabajadorPUCP.setUnidad(sc.nextLine());
                bVenta.setPersona(trabajadorPUCP);
            }else{
                bVenta.setPersona(persona);
            }
        }
        System.out.print("¿Desea comprar un Monitor? (Si/No): ");
        if (sc.nextLine().equalsIgnoreCase("si")){
            Monitor monitor = new Monitor();
            System.out.print("Modelo: ");
            monitor.setModelo(sc.nextLine());
            System.out.print("Fabricante: ");
            monitor.setFabricante(sc.nextLine());
            System.out.print("Precio (S/.): ");
            monitor.setPrecio(Double.parseDouble(sc.nextLine()));
            System.out.print("Tamaño: ");
            monitor.setTamanoPantalla(sc.nextLine());
            System.out.println("Color: ");
            monitor.setColor(sc.nextLine());
            bVenta.getListaPerifericos().add(monitor);
        }
        System.out.print("¿Desea comprar un Teclado? (Si/No): ");
        if (sc.nextLine().equalsIgnoreCase("Si")){
            Teclado teclado = new Teclado();
            System.out.print("Modelo: ");
            teclado.setModelo(sc.nextLine());
            System.out.print("Fabricante: ");
            teclado.setFabricante(sc.nextLine());
            System.out.print("Precio (S/.): ");
            teclado.setPrecio(Double.parseDouble(sc.nextLine()));
            System.out.print("Idioma: ");
            teclado.setIdioma(sc.nextLine());
            System.out.print("Color: ");
            teclado.setColor(sc.nextLine());
            System.out.print("¿Es inalámbrico? (Si/No): ");
            teclado.setInalambrico(sc.nextLine().equalsIgnoreCase("si")?true:false);
            bVenta.getListaPerifericos().add(teclado);
        }
        System.out.print("¿Desea comprar un Mouse? (Si/No): ");
        if (sc.nextLine().equalsIgnoreCase("si")){
            Mouse mouse = new Mouse();
            System.out.print("Modelo: ");
            mouse.setModelo(sc.nextLine());
            System.out.print("Fabricante: ");
            mouse.setFabricante(sc.nextLine());
            System.out.print("Precio (S/.): ");
            mouse.setPrecio(Double.parseDouble(sc.nextLine()));
            System.out.print("Color: ");
            mouse.setColor(sc.nextLine());
            System.out.print("¿Es inalámbrico? (Si/No): ");
            mouse.setInalambrico(sc.nextLine().equalsIgnoreCase("si")?true:false);
            bVenta.getListaPerifericos().add(mouse);
        }
    }
}
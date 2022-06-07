package pe.edu.pucp.iweb;

import pe.edu.pucp.iweb.controller.CVentas;
import pe.edu.pucp.iweb.model.data.DVentas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DVentas dVentas = new DVentas();
        CVentas cVentas = new CVentas(dVentas);

        boolean estado = true;
        while (estado) {
            switch (Main.menuPricipal()) {
                case "1":
                    System.out.println("\n Registrar venta");
                    System.out.println("---------------------------------------------");
                    cVentas.registrarCVenta();
                    break;
                case "2":
                    System.out.println("\n Listar ventas");
                    System.out.println("---------------------------------------------");
                    cVentas.listarCVentas();
                    break;
                case "3":
                    System.out.println("\n Buscar ventas por persona (DNI)");
                    System.out.println("---------------------------------------------");
                    cVentas.listarCVentasxDNI();
                    break;
                case "9":
                    estado = false;
                    System.out.println("\n ------ Cerrando Programa ------ \n");
                    break;
                default:
                    System.out.println("\nIngrese una opción valida\n");
                    break;
            }
        }
    }

    public static String menuPricipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|            Menú                           |");
        System.out.println("| 1 <- Registrar ventas                     |");
        System.out.println("| 2 <- Listar ventas                        |");
        System.out.println("| 3 <- Buscar ventas por persona (DNI)      |");
        System.out.println("| 9 <- Salir                                |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Ingrese opción : ");
        return scanner.nextLine();

    }

}

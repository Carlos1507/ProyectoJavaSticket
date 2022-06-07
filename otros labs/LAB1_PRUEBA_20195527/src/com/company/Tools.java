package com.company;

import com.company.bean.Estudiante;

public class Tools {
    public static double costoTotal(Estudiante estudiante){
        double subtotal=0, total = 0;
        boolean descuento;
        if (estudiante.getComputadora() == null)
            subtotal +=0;
        else{
            subtotal += estudiante.getComputadora().getPrecio();
        }
        if (estudiante.getMonitor() == null)
            subtotal +=0;
        else{
            subtotal += estudiante.getMonitor().getPrecio();
        }
        if (estudiante.getMouse() == null)
            subtotal +=0;
        else{
            subtotal += estudiante.getMouse().getPrecio();
        }
        if (estudiante.getTeclado() == null)
            subtotal +=0;
        else{
            subtotal += estudiante.getTeclado().getPrecio();
        }
        descuento = estudiante.getCorreoPUCP().contains("@pucp.edu.pe");
        if (descuento) {
            total = 0.5 * subtotal;
        } else{
            total = subtotal;
        }
        return total;
    }
}

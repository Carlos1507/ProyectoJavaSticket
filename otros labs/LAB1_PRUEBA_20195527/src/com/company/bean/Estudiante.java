package com.company.bean;

import com.company.bean.equipos.Computadora;
import com.company.bean.equipos.Monitor;
import com.company.bean.equipos.Mouse;
import com.company.bean.equipos.Teclado;

public class Estudiante {
    private String codigoPUCP;
    private String nombre;
    private String apellido;
    private String cicloIngreso;
    private String correoPUCP;
    private Computadora computadora;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public String getCodigoPUCP() {
        return codigoPUCP;
    }

    public void setCodigoPUCP(String codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCicloIngreso() {
        return cicloIngreso;
    }

    public void setCicloIngreso(String cicloIngreso) {
        this.cicloIngreso = cicloIngreso;
    }

    public String getCorreoPUCP() {
        return correoPUCP;
    }

    public void setCorreoPUCP(String correoPUCP) {
        this.correoPUCP = correoPUCP;
    }


}

package pe.edu.pucp.iweb.model.bean;

import pe.edu.pucp.iweb.model.bean.perifericos.Periferico;
import pe.edu.pucp.iweb.model.bean.personas.Persona;

import java.util.ArrayList;

public class BVenta {
    private String fechahora;
    private Persona persona;
    private ArrayList<Periferico> listaPerifericos = new ArrayList<>();

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ArrayList<Periferico> getListaPerifericos() {
        return listaPerifericos;
    }

    public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }
}
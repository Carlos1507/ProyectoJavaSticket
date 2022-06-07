package com.company.dispositivos;

import com.company.Equipo;

import java.util.ArrayList;

public class Switch extends Equipo {
    private ArrayList<Puerto> listaPuertos = new ArrayList<>();

    public ArrayList<Puerto> getListaPuertos() {
        return listaPuertos;
    }

    public void setListaPuertos(ArrayList<Puerto> listaPuertos) {
        this.listaPuertos = listaPuertos;
    }
    public Switch(String nombre, String modelo, ArrayList<Puerto> listaPuertos){
        super(nombre, modelo);
        this.listaPuertos = listaPuertos;
    }
    public Switch(){

    }
}

package com.company.dispositivos;

import com.company.Equipo;
import com.company.Vlan;

public class Puerto {
    private int numeroPuertos;
    private Vlan vlan = new Vlan();
    private Equipo equipo = new Equipo();

    public int getNumeroPuertos() {
        return numeroPuertos;
    }

    public void setNumeroPuertos(int numeroPuertos) {
        this.numeroPuertos = numeroPuertos;
    }

    public Vlan getVlan() {
        return vlan;
    }

    public void setVlan(Vlan vlan) {
        this.vlan = vlan;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}

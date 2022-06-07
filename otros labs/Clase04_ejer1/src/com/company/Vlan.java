package com.company;

public class Vlan {
    private String nombre;
    private boolean permiteCorreo;
    private boolean permiteFacebook;
    private boolean permiteWow;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPermiteCorreo() {
        return permiteCorreo;
    }

    public void setPermiteCorreo(boolean permiteCorreo) {
        this.permiteCorreo = permiteCorreo;
    }

    public boolean isPermiteFacebook() {
        return permiteFacebook;
    }

    public void setPermiteFacebook(boolean permiteFacebook) {
        this.permiteFacebook = permiteFacebook;
    }

    public boolean isPermiteWow() {
        return permiteWow;
    }

    public void setPermiteWow(boolean permiteWow) {
        this.permiteWow = permiteWow;
    }
}

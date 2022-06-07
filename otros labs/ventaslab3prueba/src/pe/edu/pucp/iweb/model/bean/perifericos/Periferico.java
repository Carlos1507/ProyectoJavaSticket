package pe.edu.pucp.iweb.model.bean.perifericos;

public class Periferico {
    private String modelo;
    private String fabricante;
    private double precio;
    private String color;

    public Periferico(String modelo, String fabricante, double precio, String color){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.precio = precio;
        this.color = color;
    }
    public Periferico(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

package pe.edu.pucp.iweb.model.bean.perifericos;

public class Monitor extends Periferico{
    private String tamanoPantalla;

    public Monitor(String modelo, String fabricante, double precio, String color, String tamanoPantalla){
        super(modelo, fabricante, precio, color);
        this.tamanoPantalla = tamanoPantalla;
    }
    public Monitor(){

    }
    public String getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }



}

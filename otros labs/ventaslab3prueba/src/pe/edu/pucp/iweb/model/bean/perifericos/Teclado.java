package pe.edu.pucp.iweb.model.bean.perifericos;

public class Teclado extends Periferico{
    private String idioma;
    private boolean inalambrico;

    public Teclado(String modelo, String fabricante, double precio, String color, boolean inalambrico, String idioma){
        super(modelo, fabricante, precio, color);
        this.inalambrico = inalambrico;
        this.idioma = idioma;
    }
    public Teclado(){

    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }
}

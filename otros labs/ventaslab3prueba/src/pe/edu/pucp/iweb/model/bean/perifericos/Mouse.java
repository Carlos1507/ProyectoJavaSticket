package pe.edu.pucp.iweb.model.bean.perifericos;

public class Mouse extends Periferico{
    private boolean inalambrico;

    public Mouse(String modelo, String fabricante, double precio, String color, boolean inalambrico){
        super(modelo, fabricante, precio, color);
        this.inalambrico = inalambrico;
    }
    public Mouse(){

    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }
}

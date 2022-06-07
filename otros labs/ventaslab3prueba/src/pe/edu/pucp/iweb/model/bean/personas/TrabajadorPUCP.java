package pe.edu.pucp.iweb.model.bean.personas;

public class TrabajadorPUCP extends Persona{
    private String codigoPUCP;
    private String correoPUCP;
    private String unidad;

    public String getCodigoPUCP() {
        return codigoPUCP;
    }

    public void setCodigoPUCP(String codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }

    public String getCorreoPUCP() {
        return correoPUCP;
    }

    public void setCorreoPUCP(String correoPUCP) {
        this.correoPUCP = correoPUCP;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}

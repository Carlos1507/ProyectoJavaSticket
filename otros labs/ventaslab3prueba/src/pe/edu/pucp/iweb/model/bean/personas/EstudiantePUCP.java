package pe.edu.pucp.iweb.model.bean.personas;

public class EstudiantePUCP extends Persona{
    private String codigoPUCP;
    private String correoPUCP;
    private String cicloIngreso;

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

    public String getCicloIngreso() {
        return cicloIngreso;
    }

    public void setCicloIngreso(String cicloIngreso) {
        this.cicloIngreso = cicloIngreso;
    }
}

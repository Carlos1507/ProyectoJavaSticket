package pe.edu.pucp.iweb.model.data;

import pe.edu.pucp.iweb.model.bean.BVenta;

import java.util.ArrayList;

public class DVentas {
    private ArrayList<BVenta> listaVentas = new ArrayList<>();
    public ArrayList<BVenta> registroVentas (BVenta bventa){
        listaVentas.add(bventa);
        return listaVentas;
    }

}

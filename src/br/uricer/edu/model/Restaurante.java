package br.uricer.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    
    List<Mesa> mesas = null;

    public Restaurante() {
        mesas = new ArrayList<Mesa>(6);
        
        Mesa mesa1 = new Mesa(1);
        mesas.add(mesa1);
        
        Mesa mesa2 = new Mesa(2);
        mesas.add(mesa2);
        
        Mesa mesa3 = new Mesa(3);
        mesas.add(mesa3);
        
        Mesa mesa4 = new Mesa(4);
        mesas.add(mesa4);
        
        Mesa mesa5 = new Mesa(5);
        mesas.add(mesa5);
        
        Mesa mesa6 = new Mesa(6);
        mesas.add(mesa6);
    }
    
    public List<Mesa> listarMesasLivres() {
        List<Mesa> mesasLivres = new ArrayList<Mesa>();
        
        for(Mesa mesa:mesas) {
            if(!mesa.isOcupada()) {
                mesasLivres.add(mesa);
            }
        }
        
        return mesasLivres;
    }
    
    public void ocuparMesa(Mesa mesa) {
        mesa.ocupar();
    }
}

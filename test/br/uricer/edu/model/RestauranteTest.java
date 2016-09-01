package br.uricer.edu.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {
    
    @Test
    public void deveListarTodasMesasLivres() {
        Restaurante restaurante = new Restaurante();
        assertEquals(6, restaurante.listarMesasLivres().size());
    }
    
    public void deveOcuparMesa() {
        Restaurante restaurante = new Restaurante();
        List<Mesa> mesasLivres = restaurante.listarMesasLivres();
        Mesa mesaLivre = mesasLivres.get(0);
        
        restaurante.ocuparMesa(mesaLivre);
        assertEquals(5, restaurante.listarMesasLivres().size());
    }
    
}

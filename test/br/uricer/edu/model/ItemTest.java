package br.uricer.edu.model;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    
    @Test
    public void deveTotalizarItem() {
        Produto produto = new Produto();
        Item item = new Item();
        item.setProduto(produto);
        item.setQuantidade(new BigDecimal("2.0"));
        item.setValorUnitario(new BigDecimal("2.50"));
        
        item.totalizar();
        
        assertEquals(new BigDecimal("5.00"), item.getValorTotal());        
    }    
}

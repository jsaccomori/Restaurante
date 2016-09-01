package br.uricer.edu.model;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class MesaTest {
    
    @Test
    public void deveIniciarComoDesocupada() {
        Mesa mesa = new Mesa(1);
        assertEquals(false, mesa.isOcupada());
    }
    
    @Test
    public void deveRetornarOcupadaAposOcupar() {
        Mesa mesa = new Mesa(1);
        mesa.ocupar();
        assertEquals(true, mesa.isOcupada());
    }
    
    @Test
    public void deveAdicionarItemAMesa() {
        Produto produto = new Produto();
        produto.setDescricao("Coca Cola");
        produto.setPreco(new BigDecimal("1.50"));
        Mesa mesa = new Mesa(1);
        BigDecimal quantidade = new BigDecimal("2.0");
        mesa.adicionarItem(produto, quantidade);
        
        assertEquals(1, mesa.getItens().size());
    }
    
    @Test
    public void deveTotalizarItensDaMesa() {
        Produto coca = new Produto();
        coca.setDescricao("Coca Cola");
        coca.setPreco(new BigDecimal("1.50"));
        
        Produto suco = new Produto();
        suco.setDescricao("Suco de laranja");
        suco.setPreco(new BigDecimal("1.0"));
        
        Mesa mesa = new Mesa(1);
        mesa.adicionarItem(coca, new BigDecimal("1"));
        mesa.adicionarItem(suco, new BigDecimal("2"));
        
        mesa.totalizar();
        
        assertEquals(new BigDecimal("3.50"), mesa.getValorTotal());
    }
    
}

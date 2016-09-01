package br.uricer.edu.model;

import java.math.BigDecimal;
import java.util.List;


public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Inicializando Restaurante");
        Restaurante restaurante = new Restaurante();
        
        System.out.println("Listando Mesas Desocupadas");
        List<Mesa> mesasLivres = restaurante.listarMesasLivres();
        for(Mesa mesa: mesasLivres) {
            System.out.println("Mesa " + mesa.getNumero());
        }
        
        System.out.println("Selecionando a primeira mesa livre");
        Mesa mesa = mesasLivres.get(0);
        mesa.ocupar();
        
        System.out.println("Inicializando um produto");
        Produto produto1 = new Produto();
        produto1.setDescricao("Coca Cola");
        produto1.setPreco(new BigDecimal("1.00"));
        
        System.out.println("Adicionado produto a mesa");
        mesa.adicionarItem(produto1, new BigDecimal("2.00"));
        
        System.out.println("Totalizando a mesa");
        mesa.totalizar();
        System.out.println("Valor: " + mesa.getValorTotal());
        
        System.out.println("Desocupando a mesa");
        mesa.desocupar();
    }
    
}

package br.uricer.edu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private int numero;
    private boolean ocupada;
    private List<Item> itens = new ArrayList<Item>();
    private BigDecimal valorTotal;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void ocupar() {
        ocupada = true;
    }

    public void desocupar() {
        ocupada = false;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void totalizar() {
        valorTotal = new BigDecimal("0.00");

        for (Item item : itens) {
            item.totalizar();
            valorTotal = valorTotal.add(item.getValorTotal());
        }

        valorTotal.setScale(2);
    }

    public void adicionarItem(Produto produto, BigDecimal quantidade) {
        Item novoItem = new Item();
        novoItem.setProduto(produto);
        novoItem.setQuantidade(quantidade);
        novoItem.setValorUnitario(produto.getPreco());
        itens.add(novoItem);
    }

}

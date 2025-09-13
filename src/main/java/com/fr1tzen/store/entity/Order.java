/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fr1tzen.store.entity;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Luísa
 */
public class Order {
    private Client cliente;
    private List<OrderProduct> produtos;
    private LocalDate data;
    private double valorTotal;

    public Order(Client cliente, List<OrderProduct> produto) {
        this.cliente = cliente;
        this.produtos = produto;
    }
    
    public double getValorTotal(){
        return produtos.stream().mapToDouble(item-> item.getProduto().getPreco() * item.getQuantidade()).sum();
    }
    
    public void addProduto(OrderProduct op){
        if(op != null){
            produtos.add(op);
        }
    }
    
}

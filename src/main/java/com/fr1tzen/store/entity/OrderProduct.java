/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fr1tzen.store.entity;

import java.time.LocalDate;

/**
 *
 * @author Luísa
 */
public class OrderProduct {
    private Product produto;
    private int quantidade;
    

    public OrderProduct(Product produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        
    }
    
    public Product getProduto(){
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

 
    
    
    
    
    
}

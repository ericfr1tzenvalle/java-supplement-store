/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fr1tzen.store.entity;

/**
 *
 * @author Luísa
 */
public enum Category {
    TERMOGENICO("Termogenico"),
    PROTEINA("Proteina"),
    PRETREINO("Pre-treino"),
    VITAMINA("Vitamina"),
    HIPERCALORICO("Hipercalorico"),
    SAUDE_GERAL("Saude"),
    SUPLEMENTOS_ESPECIAIS("Especial");
    
    private String nome;
    private Category(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}

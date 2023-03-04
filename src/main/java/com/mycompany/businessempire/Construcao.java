/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.businessempire;

/**
 *
 * @author g_120
 */
public class Construcao {

    String nome;
    long resourceBuilder;
    long resourceMetal;
    long resourceWood;
    long resourceConcrete;
    long custo;
    
    void mostrarDetalhes() {
        System.out.println(nome);
        System.out.println("Builders: " + resourceBuilder);
        System.out.println("Metal: " + resourceMetal);
        System.out.println("Wood: " + resourceWood);
        System.out.println("Concrete: " + resourceConcrete);
        System.out.println();
    }
}
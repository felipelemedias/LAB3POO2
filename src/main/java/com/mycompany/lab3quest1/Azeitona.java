/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3quest1;

/**
 *
 * @author fleme
 */
public class Azeitona extends ToppingDecorator {
    
    public Azeitona(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double custo() {
        return pizza.custo() + 1.50;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + "com azeitona";
    }
    
}

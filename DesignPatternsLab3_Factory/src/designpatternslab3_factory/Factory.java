/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternslab3_factory;

/**
 *
 * @author minarafla
 */
public abstract class Factory {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

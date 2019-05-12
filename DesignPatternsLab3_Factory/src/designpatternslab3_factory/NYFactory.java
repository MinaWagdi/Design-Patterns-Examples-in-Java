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
public class NYFactory extends Factory {

    @Override
    public Pizza createPizza(String type) {
        if(type=="Cheese"){
            return new NYCheesePizza();
        }
        else {
            return new NYGreekPizza();
        }
    }
    
    
}

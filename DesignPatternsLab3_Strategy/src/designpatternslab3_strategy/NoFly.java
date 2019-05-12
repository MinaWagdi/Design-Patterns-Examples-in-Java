/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternslab3_strategy;

/**
 *
 * @author minarafla
 */
public class NoFly implements FlyingBehavior{

    @Override
    public String fly() {
        return "I cannot fly Dear";
    }
    
}

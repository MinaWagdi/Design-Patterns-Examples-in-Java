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
public class RedDuck extends Duck{

    public RedDuck() {
        this.f=new FlyWithWings();
        this.q=new Quack();
    }
    
    

    @Override
    protected String display() {
        return "Hello, I am a red Duck";
    }
    
}

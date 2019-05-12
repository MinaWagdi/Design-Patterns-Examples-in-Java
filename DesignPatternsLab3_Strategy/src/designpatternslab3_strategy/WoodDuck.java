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
public class WoodDuck extends Duck{

    public WoodDuck() {
        this.f=new NoFly();
        this.q=new Mute();
    }

    
    @Override
    protected String display() {
        return "Hello, I am a wood duck";
    }
    
}

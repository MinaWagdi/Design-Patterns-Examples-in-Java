/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternslab3_decorator;

/**
 *
 * @author minarafla
 */
public class Soy extends Decorator {
    
    public Soy(BeverageInterface b) {
        super(b);
    }

    @Override
    public double getCost() {
        return this.beverageInterface.getCost()+1;
    }

    @Override
    public String getDescription() {
        return this.beverageInterface.getDescription()+", Soy";
    }
}

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
public class DesignPatternsLab3_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BeverageInterface b = new Cappuccino(new Caramel(new Caramel(new Soy(new PlainBeverage()))));
        System.out.println(b.getCost());
    }
    
    
    
}

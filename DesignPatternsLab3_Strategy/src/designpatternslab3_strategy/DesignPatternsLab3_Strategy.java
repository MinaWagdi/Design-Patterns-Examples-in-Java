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
public class DesignPatternsLab3_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck d1 = new WoodDuck();
        Duck d2 = new RedDuck();
        
        d1.performFly();
        d1.performQuack();
        System.out.println("");
        d2.performFly();
        d2.performQuack();
    }
    
}

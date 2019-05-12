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
public class DesignPatternsLab3_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory f = new NYFactory();
        f.orderPizza("Cheese");
    }
    
}

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
public abstract class Decorator implements BeverageInterface{

    BeverageInterface beverageInterface;
    public Decorator(BeverageInterface b){
        this.beverageInterface=b;
    }
    
}

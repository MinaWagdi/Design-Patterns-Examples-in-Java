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
public abstract class Duck {
    protected String name;
    public static int id =0;
   
    protected FlyingBehavior f;
    protected QuackingBehavior q;

    public Duck() {
        id++;
        name = "Duck#"+id;
    }
    
    protected String swim(){
        return "I am swimming";
    }
    protected abstract String display();
    
    public void performFly(){
        System.out.println(this.f.fly());
    }
    public void performQuack(){
        System.out.println(this.q.quack());
    }
    
    
    
    
}

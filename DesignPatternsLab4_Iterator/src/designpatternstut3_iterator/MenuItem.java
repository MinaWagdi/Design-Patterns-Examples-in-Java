/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstut3_iterator;

/**
 *
 * @author minarafla
 */
public class MenuItem {
    public String name;
    public double price;

    public MenuItem(String name, double price) {
        this.name=name;
        this.price=price;
    }
    public String getDetails(){
        return name+" : "+price;
    }
    
    
}

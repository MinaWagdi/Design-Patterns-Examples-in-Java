/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstut3_iterator;

import java.util.ArrayList;

/**
 *
 * @author minarafla
 */
public class SayCheeseMenu implements Menu {
    
    MenuItem[] Menuitems;

    public SayCheeseMenu() {
        Menuitems = new MenuItem[2];
        
        Menuitems[0]=new MenuItem("Nutella",60);
        Menuitems[1]=new MenuItem("Strawberry",40);
    }

   
    @Override
    public IteratorInterface createIterator() {
        IteratorInterface i = new ArrayIterator(Menuitems);
        return i;
    }
    
    
    
}

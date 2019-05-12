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
public class WillysKitchenMenu implements Menu{
    ArrayList<Object> Menuitems;

    public WillysKitchenMenu() {
        Menuitems = new ArrayList<Object>();
        
        Menuitems.add(new MenuItem("Nacho Chicken", 70));
        Menuitems.add(new MenuItem("Burger", 80));
    }

    @Override
    public IteratorInterface createIterator() {
        IteratorInterface i = new ArrayListIterator(Menuitems);
        return i;
    }
    
    
    
    
}

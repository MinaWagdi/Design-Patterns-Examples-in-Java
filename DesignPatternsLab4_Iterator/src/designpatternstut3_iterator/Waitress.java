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
public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus=menus;
    }
    
    public void printMenus(){
        for (int i =0;i<menus.size();i++){
            printUsingIterator(menus.get(i).createIterator());
        }
    }
    
    public void printUsingIterator(IteratorInterface i){
        while(i.hasNext()){
            System.out.println(((MenuItem)(i.Next())).getDetails());
        }
    }
    
}

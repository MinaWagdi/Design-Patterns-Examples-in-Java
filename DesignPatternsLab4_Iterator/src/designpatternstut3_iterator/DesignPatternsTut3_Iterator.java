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
public class DesignPatternsTut3_Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SayCheeseMenu scm = new SayCheeseMenu();
        WillysKitchenMenu wkm = new WillysKitchenMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(wkm);
        menus.add(scm);
        Waitress w = new Waitress(menus);
        w.printMenus();
    }
    
}

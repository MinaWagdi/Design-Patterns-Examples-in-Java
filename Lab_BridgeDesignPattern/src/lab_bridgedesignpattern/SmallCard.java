/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_bridgedesignpattern;

/**
 *
 * @author minarafla
 */
public class SmallCard extends Card {
    
    public SmallCard(IResource r) {
        super(r);
    }

    @Override
    public void show() {
        System.out.println("small card"+resource.getPhoto());
    }
    
}

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
public class LargeCard extends Card {
    
    public LargeCard(IResource r) {
        super(r);
    }

    @Override
    public void show() {
        System.out.println("Large Card"+resource.getTitle());
    }
    
}

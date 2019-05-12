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
public abstract class Card {
    IResource resource;
    public Card(IResource r){
        this.resource=r;
    }
    
    public abstract void show();
}

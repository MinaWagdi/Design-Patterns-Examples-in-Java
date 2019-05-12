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
public class Lab_BridgeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artist a = new Artist();
        Playlist p = new Playlist();
        Song s = new Song();
        
        SmallCard sc = new SmallCard(new SongResource(s));
        sc.show();
    }
    
}

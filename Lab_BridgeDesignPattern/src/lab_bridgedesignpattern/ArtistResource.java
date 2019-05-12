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
public class ArtistResource implements IResource{
    Artist artist;

    public ArtistResource(Artist a) {
        this.artist=a;
    }
    
    
    
    public String getTitle(){
        return artist.name;
    }
    public String getPhoto(){
        return artist.artistPhoto;
    }
}

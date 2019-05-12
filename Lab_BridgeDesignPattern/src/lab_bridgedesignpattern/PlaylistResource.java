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
public class PlaylistResource implements IResource{
    Playlist list;
    
    public PlaylistResource(Playlist s) {
        this.list = s;
    }
    public String getTitle(){
        return list.name;
    }
    public String getPhoto(){
        return list.artistPhoto;
    }
    
}

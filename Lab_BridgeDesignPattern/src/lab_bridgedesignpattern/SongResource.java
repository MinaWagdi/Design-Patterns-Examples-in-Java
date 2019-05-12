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
public class SongResource implements IResource{
    Song song;

    public SongResource(Song s) {
        this.song = s;
    }
    
    
    public String getTitle(){
        return song.name;
    }
    public String getPhoto(){
        return song.artistPhoto;
    }
}

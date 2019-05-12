/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_composite;

import java.util.ArrayList;

/**
 *
 * @author minarafla
 */
public class Directory implements ContainerInterface{
    private String name;
    private ArrayList<ContainerInterface> sub;

    public Directory(String name) {
        this.name=name;
        sub = new ArrayList();
    }
    
    public void add(ContainerInterface c){
        sub.add(c);
    }
    @Override
    public void ls() {
        System.out.println(this.name);
        for(int i =0;i<sub.size();i++){
            ((ContainerInterface)(sub.get(i))).ls();
        }
    }
}

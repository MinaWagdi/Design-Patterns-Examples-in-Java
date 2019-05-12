/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_composite;

/**
 *
 * @author minarafla
 */
public class File implements ContainerInterface {
    private String name;

    public File(String name) {
        this.name=name;
    }
    
    @Override
    public void ls() {
        System.out.println(this.name);
    }
    
   
    
}

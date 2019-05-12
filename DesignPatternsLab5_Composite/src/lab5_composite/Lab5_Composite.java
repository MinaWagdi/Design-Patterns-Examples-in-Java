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
public class Lab5_Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directory designPatternsDirectory = new  Directory("designPatterns");
        Directory CreationalPatterns = new  Directory("CreationalPatterns");
        ContainerInterface lab1 = new  File("lab1");
        ContainerInterface lab2 = new  File("lab2");
        ContainerInterface lab3 = new  File("lab3");
        designPatternsDirectory.add(lab1);
        designPatternsDirectory.add(lab2);
        designPatternsDirectory.add(lab3);
        ContainerInterface lab4 = new  File("lab4");
        ContainerInterface lab5 = new  File("lab5");
        ContainerInterface lab6 = new  File("lab6");
        CreationalPatterns.add(lab4);
        CreationalPatterns.add(lab5);
        CreationalPatterns.add(lab6);
        designPatternsDirectory.add(CreationalPatterns);
        
        designPatternsDirectory.ls();
    }
    
}

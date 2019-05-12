/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_singleton;

/**
 *
 * @author minarafla
 */
public class Lab5_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Singleton s = Singleton.getInstance();
//        Singleton w = Singleton.getInstance();
    for(int i =0;i<1000;i++){
        SingletonTester tester = new SingletonTester();
        tester.start();
    }
        
        
        
    }
    
}

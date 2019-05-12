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
public class SingletonTester extends Thread {
    public void run(){
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }
}

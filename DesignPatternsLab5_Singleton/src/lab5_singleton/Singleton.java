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
public class Singleton {
    private volatile static Singleton unique= new Singleton();
    static int count=111110;

    private Singleton() {
          for(int i =count;i>0;i--){
            count--;
        }
    }
    
    public static synchronized Singleton getInstance(){
        for(int i = count;i>0;i--);
//        if(unique == null){
//            unique = new Singleton();
//        }
//        System.out.println(unique);
//        return unique;   

          if(unique == null){
              synchronized(Singleton.class){
                  if(unique == null){
                      unique = new Singleton();
                  }
              }
          }
          return unique;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstut1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author minarafla
 */
public class DesignPatternsTut1 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/* Single Responsability Principle*/

class Employee {
    private String id;
    private String name;
    private String address;
    private Date dateOfJoining;
    
    public boolean isPromotionDueThisYear(){
        return true;
    }
    public Double calcIncomeTaxForCurrentYear(){
        return 0.0;
    }
    //getters and setters
}

class Tax{
    private Double tax;
    
    public Tax(Double tax){
        this.tax=tax;
    }
    
    public void setTax(Double t){
        //some sort of equation
    }
    public Double getTax(){
        return this.tax;
    }
}
/* ------------------------------------------------------------------------------------------*/

/*Open Closed Principal*/

class Greeter{
    String formality;
    
    public String greet(String formality){
        return ""+Formality.map.get(formality);
    }
}

class Formality{
    String LevelOfFormality;
    static Map <String,String> map;
    
    public Formality(String lvl){
        this.LevelOfFormality=lvl;
        map = new HashMap<String, String>();
    }
    
    public void addFormalityGreeting(String Formality, String Greeting){
        map.put(Formality,Greeting);
    }
    
    public void modifyFormalityGreeting(String Formality, String NewGreeting){
        //Modify in HashMap
    }
    public void DeleteFormalityGreeting(String Formality){
        
    }  
}
/* ----------------------------------------------------------------------------------------*/
/*Liksov*/
//class Shape4{
//    int numberOfDifferentSides;
//    
//    public void setNumberOfDifferentSide(int s ){
//        numberOfDifferentSides=s;
//    }
//    public void numberOfCote(){};
//    public int getArea(){return 1;};
//}
//class Rectangle extends Shape4{
//    
//    public void setWidth(int w){
//        this.width=w;
//    }
//    public void setHeight(int h){
//        this.height=h;
//    }
//    public int getArea(){
//        return this.height*this.width;
//    }
//}
//
//class Square extends Shape4{
//    
//    
//    public int getArea(){
//        return this.height*this.width;
//    }
//
//}
/* ----------------------------------------------------------------------------------------*/

/* Interface segregation principle*/

interface FlyingBird{
    public void fly();
    public void molt();
}
interface NotFLyingBird{
    public void molt();
}

class Eagle implements FlyingBird{

    @Override
    public void fly() {
        
    }

    @Override
    public void molt() {
        
    }
    
}
class Penguin implements NotFLyingBird{

    @Override
    public void molt() {
        
    } 
}
/* ----------------------------------------------------------------------------------------*/

/*Dependency Inversion Principle*/

class Phone{
    public String generateWeatherAlert(WeatherTracker wt){
        return "alert";
    }
}
class Emailer{
    public String generateWeatherAlert(WeatherTracker wt){
        //return wt.currentConditions;
    }
}

interface WeatherTracker{
    
    public void setCurrentConditions(String weatherDescription);
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_observerdesignpattern;

import java.util.ArrayList;

/**
 *
 * @author minarafla
 */
public class WeatherStation implements IObservable{

    ArrayList<Observer> observers;
    String temperature;

    public WeatherStation() {
        observers = new ArrayList<Observer>();
        temperature="50";
        //System.out.println(observers.size());
    }
    
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i =0;i<this.observers.size();i++){
            this.observers.get(i).update(this.temperature);
        }
    }
    
    public void setTemperature(String temperature){
        this.temperature=temperature;
    }
    
}

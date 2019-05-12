/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_observerdesignpattern;

/**
 *
 * @author minarafla
 */
public class ForecastDisplay implements Observer {

    IObservable o;
    public ForecastDisplay(IObservable o) {
        this.o= o;
        o.addObserver(this);
    }
    @Override
    public void update(String temp) {
        System.out.println("Statistics Display"+temp);
    }
    
}

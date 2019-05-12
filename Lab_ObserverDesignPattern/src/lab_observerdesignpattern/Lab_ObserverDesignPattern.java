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
public class Lab_ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IObservable weatherStation = new WeatherStation();
        
        GeneralDisplay gd = new GeneralDisplay(weatherStation);
        StatisticsDisplay sd = new StatisticsDisplay(weatherStation);
        ForecastDisplay fd = new ForecastDisplay(weatherStation);
        
        weatherStation.notifyObservers();
    }
    
}

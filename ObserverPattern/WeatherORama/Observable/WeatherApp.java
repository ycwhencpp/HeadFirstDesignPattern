package HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observable;

import java.util.ArrayList;
import java.util.List;

import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observers.Observer;

public class WeatherApp implements Observable {

    private float temp;
    private float pressure;
    private float humidity;
    private List<Observer> observerList;


    public WeatherApp(){
        this.observerList = new ArrayList<>();
    }



    @Override
    public void add(Observer o) {
        this.observerList.add(o);
        
    }

    @Override
    public void notifyObservers() {
        for(Observer o : this.observerList){
            o.update(humidity, temp, pressure);
        }
        
    }

    @Override
    public void remove(Observer o) {

        int index = this.observerList.indexOf(o);
        if(index>=0){
            this.observerList.remove(o);
        }
        
    }

    private void measurementChanged(){
        this.notifyObservers();
    }

    public void setMeasurements(float ...args){
        this.humidity = args[0];
        this.temp = args[1];
        this.pressure = args[2];
        this.measurementChanged();
    }
    
}

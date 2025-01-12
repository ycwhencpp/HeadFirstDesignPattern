package HeadFirstDesignPattern.ObserverPattern.WeatherORama.Displays;

import HeadFirstDesignPattern.ObserverPattern.WeatherORama.DisplayType.DisplayType;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observable.Observable;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observers.Observer;

public class CurrentConditions implements Observer, DisplayType {

    float temp;
    float pressure;
    float humidity;

    Observable obs;

    public CurrentConditions(Observable obs) {
        this.obs = obs;
        obs.add(this);
    }


    @Override
    public void update(float...args) {
        this.humidity = args[0];
        this.temp = args[1];
        this.pressure = args[2];

        this.display();

    }

    @Override
    public void display() {        
        System.out.println(String.format("Current Temp is %.1f with air pressure of %.2f and have %.1f water in air", temp, pressure, humidity));
                
    }
    
}

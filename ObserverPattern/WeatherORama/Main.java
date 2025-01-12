package HeadFirstDesignPattern.ObserverPattern.WeatherORama;

import HeadFirstDesignPattern.ObserverPattern.WeatherORama.DisplayType.DisplayType;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Displays.CurrentConditions;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Displays.Forecast;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observable.WeatherApp;

public class Main {
    public static void main(String[] args) {
        WeatherApp weatherapp = new WeatherApp();



        Forecast forecast = new Forecast(weatherapp);
        CurrentConditions currentConditons = new CurrentConditions(weatherapp);

        weatherapp.setMeasurements(5.2f,10.2f,30.5f);
        weatherapp.setMeasurements(9.2f,11.2f,31.5f);

        // forecast.display();
        // currentConditons.display();
    }
}

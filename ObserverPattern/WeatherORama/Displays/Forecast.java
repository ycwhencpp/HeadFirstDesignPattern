package HeadFirstDesignPattern.ObserverPattern.WeatherORama.Displays;

import HeadFirstDesignPattern.ObserverPattern.WeatherORama.DisplayType.DisplayType;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observable.Observable;
import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observers.Observer;

public class Forecast implements Observer, DisplayType {
    float temp;
    float pressure;
    float humidity;

    Observable obs;

    public Forecast(Observable obs) {
        this.obs = obs;
        obs.add(this);
    }



    @Override
    public void display(){
        String outputString = "";
        if(temp <0){
            outputString+="Its chilling dont go outside";
        } else if (temp <30){
            outputString+= "Nice weather for a walk";
        } else {
            outputString+= "Beware of Heat Waves";
        }

        if(pressure <10){
            outputString += " As air pressure drops !!! Dont forget to do some good breathing";
        } else {
            outputString+= " Lovely Weather for a ride !!!";
        }

        System.out.println(outputString);
        
    }

    @Override
    public void update(float[] args){
        this.humidity = args[0];
        this.temp = args[1];
        this.pressure = args[2];

    }
}

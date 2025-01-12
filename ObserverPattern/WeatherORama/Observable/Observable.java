package HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observable;

import HeadFirstDesignPattern.ObserverPattern.WeatherORama.Observers.Observer;
public interface Observable{
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyObservers();
}
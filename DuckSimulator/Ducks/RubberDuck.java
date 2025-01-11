package HeadFirstDesignPattern.DuckSimulator.Ducks;

import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyBehaviour;
import HeadFirstDesignPattern.DuckSimulator.QuackBehaviour.QuackBehaviour;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehaviour flyObj, QuackBehaviour quaackObj){
        this.flyObj = flyObj;
        this.quackObj =quaackObj;
    }

    @Override
    public void display() {
       System.out.println("I am a Rubber duck");
    }
    
}

package HeadFirstDesignPattern.DuckSimulator.Ducks;

import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyBehaviour;
import HeadFirstDesignPattern.DuckSimulator.QuackBehaviour.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyObj, QuackBehaviour quaackObj){
        this.flyObj = flyObj;
        this.quackObj = quaackObj;
    }

    @Override
    public void display() {
        System.out.println("I Am a mallard duck");
    }
    
}

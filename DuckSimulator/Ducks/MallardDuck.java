package HeadFirstDesignPattern.Ducks;

import HeadFirstDesignPattern.FlyBehaviour;
import HeadFirstDesignPattern.QuackBehaviour.QuackBehaviour;

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

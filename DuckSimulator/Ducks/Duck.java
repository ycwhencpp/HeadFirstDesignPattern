package HeadFirstDesignPattern.DuckSimulator.Ducks;

import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyBehaviour;
import HeadFirstDesignPattern.DuckSimulator.QuackBehaviour.QuackBehaviour;

public abstract class Duck {
    public FlyBehaviour flyObj = null;
    public QuackBehaviour quackObj = null;


    public abstract void display();

    public void triggerFly(){
        flyObj.fly();
    }

    public void triggerQuack() {
        quackObj.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyObj){
        this.flyObj = flyObj;
    }

}

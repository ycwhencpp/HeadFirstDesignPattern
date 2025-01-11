package HeadFirstDesignPattern.DuckSimulator;

import HeadFirstDesignPattern.DuckSimulator.Ducks.Duck;
import HeadFirstDesignPattern.DuckSimulator.Ducks.MallardDuck;
import HeadFirstDesignPattern.DuckSimulator.Ducks.RubberDuck;
import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyBehaviour;
import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyDisabled;
import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyWithRocketWings;
import HeadFirstDesignPattern.DuckSimulator.FlyBehaviour.FlyWithWings;
import HeadFirstDesignPattern.DuckSimulator.QuackBehaviour.QuackBehaviour;
import HeadFirstDesignPattern.DuckSimulator.QuackBehaviour.QuackWithSound;
import HeadFirstDesignPattern.DuckSimulator.QuackBehaviour.QuackWithoutSound;

public class Main {
    public static void main(String[] args) {
        FlyBehaviour flywithWings = new FlyWithWings();
        QuackBehaviour quackwithSound = new QuackWithSound();
        Duck mallardDuck = new MallardDuck(flywithWings, quackwithSound);

        mallardDuck.display();
        mallardDuck.triggerFly();
        mallardDuck.triggerQuack();

        FlyBehaviour flywithRocketWings = new FlyWithRocketWings();

        mallardDuck.setFlyBehaviour(flywithRocketWings);

        mallardDuck.triggerFly();

        FlyBehaviour flyDisabled = new FlyDisabled();

        QuackBehaviour quackWithoutSound = new QuackWithoutSound();

        Duck rubberDuck = new RubberDuck(flyDisabled, quackWithoutSound);

        rubberDuck.display();
        rubberDuck.triggerFly();
        rubberDuck.triggerQuack();
    }
}

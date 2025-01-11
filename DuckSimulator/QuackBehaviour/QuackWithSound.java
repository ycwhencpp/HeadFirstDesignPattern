package HeadFirstDesignPattern.DuckSimulator.QuackBehaviour;

public class QuackWithSound implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
    
}

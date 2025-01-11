package HeadFirstDesignPattern;

public class FlyDisabled implements FlyBehaviour {

    @Override
    public void fly() {
       System.out.println("Cant Fly its been disabled");
        
    }
    
}

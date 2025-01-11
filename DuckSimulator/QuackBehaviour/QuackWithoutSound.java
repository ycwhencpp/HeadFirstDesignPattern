package HeadFirstDesignPattern.QuackBehaviour;

public class QuackWithoutSound implements QuackBehaviour{

    @Override
    public void quack() {
      System.out.println("Quacking without sound");
        
    }
    
}

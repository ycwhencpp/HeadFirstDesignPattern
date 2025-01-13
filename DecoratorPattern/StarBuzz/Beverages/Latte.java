package HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages;

public class Latte extends Beverage {
    public Latte(){
        this.description = "Latte Beverage";
    }

    @Override
    public int cost() {
        return 250;
    }
    
}

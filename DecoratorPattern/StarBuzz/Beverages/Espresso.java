package HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages;

public class Espresso extends Beverage {
    public Espresso(){
        this.description = "Espresso Beverage";
    }

    public int cost() {
        return 200;
    }
}

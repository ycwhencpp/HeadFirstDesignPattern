package HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages;

public abstract class Beverage {
    String description = "Unkown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract int cost();
}

package HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Condiments;

import HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages.Beverage;

public class SoyCondiment extends Condiments {
    Beverage beverage;

    public SoyCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 90;
    }

}

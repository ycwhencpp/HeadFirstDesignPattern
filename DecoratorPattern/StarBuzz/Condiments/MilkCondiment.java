package HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Condiments;

import HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages.Beverage;

public class MilkCondiment extends Condiments {
    
    Beverage beverage;

    public MilkCondiment(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk" ;
    }


    public int cost (){
        return this.beverage.cost() + 50;
    }
}

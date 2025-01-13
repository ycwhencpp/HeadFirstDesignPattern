package HeadFirstDesignPattern.DecoratorPattern.StarBuzz;

import HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages.Beverage;
import HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Beverages.Espresso;
import HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Condiments.MilkCondiment;
import HeadFirstDesignPattern.DecoratorPattern.StarBuzz.Condiments.SoyCondiment;

public class StarBuzzBarista {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Pay Rs" + beverage.cost() + " For " + beverage.getDescription());

        Beverage milkAndEspresso =  new MilkCondiment(beverage);
        System.out.println("Pay Rs" + milkAndEspresso.cost() + " For " + milkAndEspresso.getDescription());

        Beverage DoubleMilkAndEspresso = new MilkCondiment(milkAndEspresso);
        System.out.println("Pay Rs" + DoubleMilkAndEspresso.cost() + " For " + DoubleMilkAndEspresso.getDescription());

        Beverage milkAndEspressoWithSoy = new SoyCondiment(milkAndEspresso);

        System.out.println("Pay Rs" + milkAndEspressoWithSoy.cost() + " For " + milkAndEspressoWithSoy.getDescription());


    }
}

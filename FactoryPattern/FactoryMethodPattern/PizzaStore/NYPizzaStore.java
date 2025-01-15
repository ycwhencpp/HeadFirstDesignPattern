package HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.PizzaStore;

import java.util.ArrayList;
import java.util.Arrays;

import HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.Pizza.NYStyleChessePizza;
import HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.Pizza.NYStyleVeggiePizza;
import HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.Pizza.Pizza;


public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            return new NYStyleChessePizza("CheesePizza", "Thick Dough", "Red sauce",
                    new ArrayList(Arrays.asList("Veggie", "Jalepeno", "Oregano")));
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza("VeggiePizza", "Thick Dough", "Red sauce",
                    new ArrayList(Arrays.asList("ExtraVeggie", "Jalepeno", "Oregano")));
        }
        return pizza;
    }

}

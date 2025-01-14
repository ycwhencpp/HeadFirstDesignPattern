package HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.PizzaStore;

import java.util.ArrayList;
import java.util.Arrays;

import HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.Pizza.NYStyleChessePizza;
import HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.Pizza.NYStyleVeggiePizza;
import HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.Pizza.Pizza;


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

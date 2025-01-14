package HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.PizzaFactory;

import java.util.ArrayList;
import java.util.Arrays;

import HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.Pizza.ChessePizza;
import HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.Pizza.Pizza;
import HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.Pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            return new ChessePizza("CheesePizza", "Thick Dough", "Red sauce", new ArrayList(Arrays.asList("Veggie", "Jalepeno", "Oregano")));
        } else if (type.equals("veggie")){
            return new VeggiePizza("VeggiePizza", "Thick Dough", "Red sauce", new ArrayList(Arrays.asList("ExtraVeggie", "Jalepeno", "Oregano")));
        }
        return pizza;
    }
}

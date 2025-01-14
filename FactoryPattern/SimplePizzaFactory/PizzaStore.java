package HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory;

import HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.Pizza.Pizza;
import HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.PizzaFactory.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

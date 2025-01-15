package HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.PizzaStore;

import HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

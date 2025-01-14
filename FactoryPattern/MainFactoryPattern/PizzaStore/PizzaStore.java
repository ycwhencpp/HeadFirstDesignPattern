package HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.PizzaStore;

import HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.Pizza.Pizza;

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

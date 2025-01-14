package HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory;

import HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.PizzaFactory.SimplePizzaFactory;

public class PizzaApp {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");
    }
}

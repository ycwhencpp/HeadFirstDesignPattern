package HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern;

import HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.PizzaStore.NYPizzaStore;
import HeadFirstDesignPattern.FactoryPattern.FactoryMethodPattern.PizzaStore.PizzaStore;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
    }
}
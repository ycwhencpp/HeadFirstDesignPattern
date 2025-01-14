package HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern;

import HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.PizzaStore.NYPizzaStore;
import HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.PizzaStore.PizzaStore;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
    }
}
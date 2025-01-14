package HeadFirstDesignPattern.FactoryPattern.SimplePizzaFactory.Pizza;

import java.util.ArrayList;

public class ChessePizza extends Pizza {
    public ChessePizza(String name, String Dough, String sauce, ArrayList toppings){
        this.name = name;
        this.Dough = Dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }
}

package HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.Pizza;

import java.util.ArrayList;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(String name, String Dough, String sauce, ArrayList toppings){
        this.name = name;
        this.Dough = Dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }
}

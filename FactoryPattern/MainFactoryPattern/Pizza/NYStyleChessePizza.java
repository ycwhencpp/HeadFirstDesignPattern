package HeadFirstDesignPattern.FactoryPattern.MainFactoryPattern.Pizza;

import java.util.ArrayList;

public class NYStyleChessePizza extends Pizza {
    public NYStyleChessePizza(String name, String Dough, String sauce, ArrayList toppings){
        this.name = name;
        this.Dough = Dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }
}

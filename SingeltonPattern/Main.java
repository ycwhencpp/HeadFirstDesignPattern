package HeadFirstDesignPattern.SingeltonPattern;

import HeadFirstDesignPattern.SingeltonPattern.DoubleLockingMethod.ChocolateBoiler4;
import HeadFirstDesignPattern.SingeltonPattern.EagerLoadingMethod.ChocolateBoiler2;
import HeadFirstDesignPattern.SingeltonPattern.NormalMethod.ChocolateBoiler1;
import HeadFirstDesignPattern.SingeltonPattern.SynchronizationMethod.ChocolateBoiler3;

public class Main {
    public static void main(String[] args) {
        

        ChocolateBoiler1 normalMethod = ChocolateBoiler1.getInstance();

        ChocolateBoiler2 eagerLoadingMethod = ChocolateBoiler2.getInstance();

        ChocolateBoiler3 syncMethod = ChocolateBoiler3.getInstance();

        ChocolateBoiler4 doubleLocking = ChocolateBoiler4.getInstance();


    }
}

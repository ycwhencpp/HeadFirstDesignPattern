package HeadFirstDesignPattern.SingeltonPattern.EagerLoadingMethod;

public class ChocolateBoiler2 {
    private static ChocolateBoiler2 uniqueInstance = new ChocolateBoiler2();
    private ChocolateBoiler2(){

    }

    public static ChocolateBoiler2 getInstance(){
        return uniqueInstance;
    }

}

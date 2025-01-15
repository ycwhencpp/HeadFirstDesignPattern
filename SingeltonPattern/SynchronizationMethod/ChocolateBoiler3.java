package HeadFirstDesignPattern.SingeltonPattern.SynchronizationMethod;

public class ChocolateBoiler3 {
    private static ChocolateBoiler3 uniqueInstance;
    private ChocolateBoiler3(){

    }

    public static synchronized ChocolateBoiler3 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler3();
        }
        return uniqueInstance;
    }

}

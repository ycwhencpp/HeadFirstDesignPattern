package HeadFirstDesignPattern.SingeltonPattern.NormalMethod;

public class ChocolateBoiler1 {
    private static ChocolateBoiler1 uniqueInstance;
    private ChocolateBoiler1(){

    }

    public static ChocolateBoiler1 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler1();
        }
        return uniqueInstance;
    }

}

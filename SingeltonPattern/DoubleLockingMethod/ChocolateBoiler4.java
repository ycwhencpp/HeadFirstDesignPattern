package HeadFirstDesignPattern.SingeltonPattern.DoubleLockingMethod;

public class ChocolateBoiler4 {
    private volatile static ChocolateBoiler4 uniqueInstance;
    private ChocolateBoiler4(){

    }

    public static ChocolateBoiler4 getInstance(){
        if(uniqueInstance == null){
            synchronized(ChocolateBoiler4.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateBoiler4();
                }
            }
        }
        return uniqueInstance;
    }

}
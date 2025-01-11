package HeadFirstDesignPattern.ActionGame.WeaponBehaviour;

public class Throw implements WeaponBehaviour{

    @Override
    public void attack() {
        System.out.println("Weapon throwed");
    }
    
}

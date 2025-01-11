package HeadFirstDesignPattern.ActionGame.Weapons;

import HeadFirstDesignPattern.ActionGame.WeaponBehaviour.WeaponBehaviour;

public class Knife extends WeaponType {

    public Knife(WeaponBehaviour wBehaviour) {
        this.weaponBehaviour = wBehaviour;
    }

    @Override
    public void displayWeapon() {
        System.out.println("Its a knife");
        
    }
    
}

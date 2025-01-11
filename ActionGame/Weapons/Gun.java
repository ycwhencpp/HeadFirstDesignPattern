package HeadFirstDesignPattern.ActionGame.Weapons;

import HeadFirstDesignPattern.ActionGame.WeaponBehaviour.WeaponBehaviour;

public class Gun extends WeaponType {

    public Gun(WeaponBehaviour wBehaviour){
        this.weaponBehaviour = wBehaviour;
    }

    @Override
    public void displayWeapon() {
        System.out.println("Its a Gun");
        
    }
    
}

package HeadFirstDesignPattern.ActionGame.Weapons;

import HeadFirstDesignPattern.ActionGame.WeaponBehaviour.WeaponBehaviour;

public abstract class WeaponType {
    WeaponBehaviour weaponBehaviour;

    public void triggerAttack(){
        weaponBehaviour.attack();
    }

    public abstract void displayWeapon();

}

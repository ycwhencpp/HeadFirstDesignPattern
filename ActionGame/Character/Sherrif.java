package HeadFirstDesignPattern.ActionGame.Character;

import HeadFirstDesignPattern.ActionGame.Weapons.WeaponType;

public class Sherrif extends Character {

    public Sherrif(WeaponType weaponType){
        this.wtype = weaponType;
    }

    @Override
    public void display() {
        System.out.println("Sherrif in the town");
        
    }
    
}

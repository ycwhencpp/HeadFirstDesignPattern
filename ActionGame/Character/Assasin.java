package HeadFirstDesignPattern.ActionGame.Character;

import HeadFirstDesignPattern.ActionGame.Weapons.WeaponType;

public class Assasin extends Character{

    public Assasin(WeaponType weaponType){
        this.wtype = weaponType;
    }

    @Override
    public void display() {
        System.out.println("sssh !! Assasin is Here");
        
    }
    
}

package HeadFirstDesignPattern.ActionGame;

import HeadFirstDesignPattern.ActionGame.Character.Assasin;
import HeadFirstDesignPattern.ActionGame.WeaponBehaviour.Meele;
import HeadFirstDesignPattern.ActionGame.WeaponBehaviour.RangeShoot;
import HeadFirstDesignPattern.ActionGame.WeaponBehaviour.WeaponBehaviour;
import HeadFirstDesignPattern.ActionGame.Weapons.Gun;
import HeadFirstDesignPattern.ActionGame.Weapons.Knife;
import HeadFirstDesignPattern.ActionGame.Weapons.WeaponType;
import HeadFirstDesignPattern.ActionGame.Character.Character;
import HeadFirstDesignPattern.ActionGame.Character.Sherrif;


public class Main {
    public static void main(String[] args) {
        WeaponBehaviour wBehaviour = new Meele();

        WeaponType wType = new Knife(wBehaviour);

        Character assasin = new Assasin(wType);

        WeaponBehaviour rangBehaviour = new RangeShoot();

        WeaponType gun = new Gun(rangBehaviour);

        Character sherrif = new Sherrif(gun);

        assasin.display();
        assasin.attack();

        sherrif.display();
        sherrif.attack();

        sherrif.setWeaponType(wType);
        sherrif.display();
        sherrif.attack();
        
    }
}

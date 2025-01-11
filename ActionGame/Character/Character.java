package HeadFirstDesignPattern.ActionGame.Character;

import HeadFirstDesignPattern.ActionGame.Weapons.WeaponType;

public abstract class Character {
    WeaponType wtype;

    public void attack() {
        this.wtype.triggerAttack();
    }

    public void setWeaponType(WeaponType weaponType) {
        this.wtype = weaponType;
    }
    public abstract void display();
}

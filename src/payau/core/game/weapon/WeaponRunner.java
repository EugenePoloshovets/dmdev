package payau.core.game.weapon;

import payau.core.game.Archer;
import payau.core.game.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {

        Archer<Bow> archer = new Archer<>("legolas", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("boromir", 10);
        warrior.setWeapon(new Sword());

    }
}

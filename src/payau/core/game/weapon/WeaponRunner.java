package payau.core.game.weapon;

import payau.core.game.Archer;
import payau.core.game.Hero;
import payau.core.game.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {

        Archer<Bow> archer = new Archer<>("legolas", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("boromir", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
        printWeaponDamage(warrior);

    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }

/*
    public static void printWeaponDamage(Hero<? extends Weapon> hero) {
        // hero.setWeapon(new Sword()); -- ошибка тк producer
        System.out.println(hero.getWeapon().getDamage());
    }

    public static void printWeaponDamage(Hero<? super Sword> hero) {
        hero.setWeapon(new Sword()); -- consumer
        System.out.println(hero.getWeapon().getDamage());
    }
*/
}

package payau.core.game;

import payau.core.game.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

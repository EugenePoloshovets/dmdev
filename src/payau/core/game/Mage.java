package payau.core.game;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сделал заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

package payau.core.game;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

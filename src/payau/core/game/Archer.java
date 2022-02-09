package payau.core.game;

public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 6);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    class Wolf {

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}

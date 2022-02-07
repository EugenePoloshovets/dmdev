package payau.core.game;

public class TrainingGround {

    public static void main(String[] args) {

        Hero hero = new Hero("Boromir");

        Hero archer = new Archer("Legolas");
        Hero mage = new Mage("Gendolf");
        Hero warrior = new Warrior("Boromir");

        print(hero, archer, mage, warrior);

    }

    public static void print(Hero... heroes) {
        for (Hero hero : heroes) {
            hero.attackEnemy();
        }
    }
}

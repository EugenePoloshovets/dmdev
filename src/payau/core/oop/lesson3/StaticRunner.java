package payau.core.oop.lesson3;

public class StaticRunner {

    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        Computer computer = new Computer(null, null);
        System.out.println(Computer.getCounter());
        System.out.println(computer2.getClass());
        Class clazz = computer.getClass();
        System.out.println(clazz);
        System.out.println(clazz == computer2.getClass());
        System.out.println(computer == computer2);
    }
}

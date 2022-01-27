package payau.core.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.load();
        System.out.println("ssd:" + computer.ssd);
        System.out.println("ram:" + computer.ram);
    }
}

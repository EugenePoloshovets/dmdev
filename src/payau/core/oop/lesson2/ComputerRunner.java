package payau.core.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.load();
        computer.printState();
        System.out.println();

        Computer computer2 = new Computer(512, 8096);
        computer2.printState();

    }
}

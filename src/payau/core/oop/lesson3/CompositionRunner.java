package payau.core.oop.lesson3;

public class CompositionRunner {

    public static void main(String[] args) {

        Computer computer = new Computer(new Ssd(512), new Ram(6062));
        computer.printState();

        TimeInterval timeInterval = new TimeInterval(15, 1, 1);
        System.out.println(timeInterval.sumInterval());

        TimeInterval timeInterval1 = new TimeInterval(3668);
        System.out.println(timeInterval1.sumInterval());
        timeInterval1.print();

    }
}

package payau.core.oop.lesson3;

public class Computer {

    private Ssd ssd;
    private Ram ram;
    public static int counter;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("Computer - SSD:" + ssd.getSsd() + ", Ram:" + ram.getRam());
    }
}

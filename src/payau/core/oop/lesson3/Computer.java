package payau.core.oop.lesson3;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void printState() {
        System.out.println("Computer - SSD:" + ssd.getSsd() + ", Ram:" + ram.getRam());
    }
}

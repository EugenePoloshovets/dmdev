package payau.core.enump;

public enum ProcessorType implements Describeable {

    BIT_32("bit_32"),
    BIT_64("bit_64");

    @Override
    public String getDescription() {
        return name + " description";
    }

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

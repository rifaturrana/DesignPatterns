
public class Laptop {

    protected String ram;
    protected String processor;
    protected double price;

    public Laptop(String ram, String processor, double price) {
        this.ram = ram;
        this.processor = processor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop - RAM: " + ram + ", Processor: " + processor + ", Price: $" + price;
    }
}

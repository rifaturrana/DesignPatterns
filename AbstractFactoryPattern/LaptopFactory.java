
public class LaptopFactory {

    public static Laptop getLaptop(AbstractFactory abs) {
        return abs.buildLaptop();
    }
    
}


public class HPFactoryLaptop implements AbstractFactory {

    @Override
    public Laptop buildLaptop() {
        return new HpLaptop();
    }
    
}

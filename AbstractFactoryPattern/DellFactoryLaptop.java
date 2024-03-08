
public class DellFactoryLaptop implements AbstractFactory{

    @Override
    public Laptop buildLaptop() {
        return new DellLaptop();
    }
    
}

 class Main {
    public static void main(String[] args) {
        
        Laptop hpLaptop = LaptopFactory.getLaptop(new HPFactoryLaptop());
        System.out.println("Ordered: " + hpLaptop);

        Laptop dellLaptop = LaptopFactory.getLaptop(new DellFactoryLaptop());
        System.out.println("Ordered: " + dellLaptop);
    }
}

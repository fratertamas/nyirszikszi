public class WashingMachine extends ElectronicDevice{

    public WashingMachine(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void turnOn() {
        System.out.println("A mosógép dobja forogni kezd...");
    }
}

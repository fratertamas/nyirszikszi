public abstract class ElectronicDevice {
    protected String brand;
    protected double price;

    public ElectronicDevice(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Márka: " + brand + ", Ár: " + price + " Ft");
    }

    public abstract void turnOn();
}

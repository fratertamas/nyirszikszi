public class Laptop extends  ElectronicDevice implements Connectable{
    public Laptop(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void turnOn() {
        System.out.println("A laptop operációs rendszere betölt.....");
    }

    @Override
    public void connectToWifi() {
        System.out.println("A laptop csatlakozott a WiFi hálózathoz.");
    }

    @Override
    public void disconnectFromWifi() {
        System.out.println("A laptop lecsatlakozott a WiFi hálózatról.");
    }
}

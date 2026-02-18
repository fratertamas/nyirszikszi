import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();

        // Legalább 2 Laptop és 2 mosógép
        devices.add(new Laptop("Lenovo", 250000));
        devices.add(new Laptop("Dell", 320000));
        devices.add(new WashingMachine("Electrolux", 180000));
        devices.add(new WashingMachine("LG", 210000));

        for (ElectronicDevice d : devices) {
            d.displayInfo();
            d.turnOn();

            if (d instanceof Connectable) {
                Connectable c = (Connectable) d;
                c.connectToWifi();
            }

            System.out.println("---------------");
        }

    }
}
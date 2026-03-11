public abstract class Appliance {
    protected String name;

    public Appliance(String name) {
        this.name = name;
    }

    public void showAppliance() {
        System.out.println("Gép: " + name);
    }

    public abstract void function();
}

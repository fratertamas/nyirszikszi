public class WashingMachine extends Appliance implements Switchable, Cleanable{
    public WashingMachine(String name) {
        super(name);
    }

    @Override
    public void function() {
        System.out.println(name + " mosást végez.");
    }

    @Override
    public void clean() {
        System.out.println(name + " tisztítása megtörtént.");
    }

    @Override
    public void switchOn() {
        System.out.println(name + " mosást végez.");
    }
}

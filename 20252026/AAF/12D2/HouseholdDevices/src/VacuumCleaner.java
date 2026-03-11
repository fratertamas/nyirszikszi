public class VacuumCleaner extends Appliance implements Switchable, Cleanable{
    public VacuumCleaner(String name) {
        super(name);
    }

    @Override
    public void function() {
        System.out.println(name + " porszívózik.");
    }

    @Override
    public void clean() {
        System.out.println(name + " portartálya kiürítve.");
    }

    @Override
    public void switchOn() {
        System.out.println(name + " bekapcsolva");
    }
}

public class Programmer extends Employee implements Payable{
    private int hours;
    private double hourlyRate;

    public Programmer(String name, int hours, double hourlyRate) {
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void work() {
        System.out.println(name + " programot ír.");
    }

    @Override
    public double calculateSalary() {
        return hours * hourlyRate;
    }
}

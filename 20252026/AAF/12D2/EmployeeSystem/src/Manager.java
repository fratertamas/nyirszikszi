public class Manager extends Employee implements Payable{
    private double monthlySalary;

    public Manager(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void work() {
        System.out.println(name + " irányítja a csapatot.");
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

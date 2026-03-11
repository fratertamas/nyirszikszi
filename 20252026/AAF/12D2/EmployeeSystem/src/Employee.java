public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Alkalmazott: " + name);
    }

    public abstract void work();
}

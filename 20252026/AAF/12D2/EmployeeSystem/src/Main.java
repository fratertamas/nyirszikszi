import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Programmer("Ádám", 160, 3500));
        employees.add(new Manager("Katika", 900000));

        for (Employee e : employees) {
            e.display();
            e.work();

            if (e instanceof Payable) {
                Payable p = (Payable) e;
                System.out.println("Fizetés: " + p.calculateSalary());
            }
            System.out.println("-----");
        }

    }
}
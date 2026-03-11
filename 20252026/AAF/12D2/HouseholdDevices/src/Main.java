import java.awt.desktop.AppForegroundListener;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Appliance> appliances = new ArrayList<>();

        appliances.add(new WashingMachine("LG mosógép"));
        appliances.add(new VacuumCleaner("Philips porszívó"));

        for (Appliance a : appliances) {
            a.showAppliance();
            a.function();

            if (a instanceof Switchable) {
                ((Switchable) a).switchOn();
            }

            if (a instanceof Cleanable) {
                ((Cleanable) a).clean();
            }

            System.out.println("-----");
        }
    }
}
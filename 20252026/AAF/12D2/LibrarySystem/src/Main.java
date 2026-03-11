import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book("Az ember tragédiája"));
        items.add(new Magazine("National Geographic"));

        for (LibraryItem item : items) {
            item.displayTitle();
            item.describe();

            if (item instanceof Borrowable) {
                ((Borrowable) item).borrowItem();
            }
            System.out.println("-----");
        }
    }
}
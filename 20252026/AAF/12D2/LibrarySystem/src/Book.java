public class Book extends LibraryItem implements Borrowable{

    public Book(String title) {
        super(title);
    }

    @Override
    public void borrowItem() {
        System.out.println(title + " kikölcsönözve");
    }

    @Override
    public void describe() {
        System.out.println(title + " egy könyv.");
    }
}

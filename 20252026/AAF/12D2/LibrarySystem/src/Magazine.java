public class Magazine extends LibraryItem implements Borrowable{
    public Magazine(String title) {
        super(title);
    }

    @Override
    public void describe() {
        System.out.println(title + " egy magazin.");
    }


    @Override
    public void borrowItem() {
        System.out.println(title + " kikölcsönözve rövid időre.");
    }
}

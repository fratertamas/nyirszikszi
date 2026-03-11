public abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Cím: " + title);
    }

    public abstract void describe();
}

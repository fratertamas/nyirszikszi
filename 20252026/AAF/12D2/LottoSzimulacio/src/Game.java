public abstract class Game implements Playable{
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Játék neve: " + name);
    }

    public abstract void play();
}

import java.util.ArrayDeque;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Anna");
        queue.offer("Béla");
        queue.offer("Csilla");

        System.out.println(queue.size()); // 3
        System.out.println(queue.peek()); // Anna (csak ránéztünk)
        System.out.println(queue.poll()); // Anna kivételre is került
        System.out.println(queue.size()); // 2
        System.out.println(queue.peek()); // Béla

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll()); // null (poll() üres sorra történő hívása)
    }
}
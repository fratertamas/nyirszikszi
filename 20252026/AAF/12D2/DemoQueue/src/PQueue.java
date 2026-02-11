import java.util.*;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();

        integerQueue.offer(50);
        integerQueue.offer(10);
        integerQueue.offer(30);

        while (!integerQueue.isEmpty()) {
            System.out.println(integerQueue.poll());
        }


    }
}

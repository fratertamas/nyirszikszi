import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LotteryGame extends Game{
    private int min;
    private int max;
    private int count;
    private Random rnd;

    public LotteryGame(String name, int min, int max, int count) {
        super(name);
        this.min = min;
        this.max = max;
        this.count = count;
        this.rnd = new Random();
    }


    @Override
    public void play() {
        displayInfo();

        Set<Integer> winning = generateUniqueNumbers();
        Set<Integer> ticket = generateUniqueNumbers(); // egyszerű: véletlen szelvény

        System.out.println("Szelvény: " + setToString(ticket));
        System.out.println("Nyerőszámok: " + setToString(winning));

        int hits = countIntersection(ticket, winning);
        System.out.println("Találatok száma: " + hits);

        System.out.println("---------------");
    }

    private int countIntersection(Set<Integer> ticket, Set<Integer> winning) {
        int hits = 0;
        Iterator<Integer> it = ticket.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (winning.contains(x)) {
                hits++;
            }
        }
        return hits;
    }

    private String setToString(Set<Integer> set) {
        // egyszerű kiírás, rendezés nélkül
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    private Set<Integer> generateUniqueNumbers() {
        Set<Integer> nums = new HashSet<Integer>();
        while (nums.size() < count) {
            int n = rnd.nextInt(max - min + 1) + min; // [min...max]
            nums.add(n);
        }
        return nums;
    }
}

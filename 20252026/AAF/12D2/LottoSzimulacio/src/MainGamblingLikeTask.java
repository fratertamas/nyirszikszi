import java.util.ArrayList;
import java.util.List;

public class MainGamblingLikeTask {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();

        games.add(new LotteryGame("Hatoslottó szimuláció", 1, 45, 6));
        games.add(new LotteryGame("Skandináv lottó szimuláció", 1, 35, 7));

        for (Game g : games) {
            g.play(); // polimorfizmus
        }
    }
}

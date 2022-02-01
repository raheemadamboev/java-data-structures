import java.util.ArrayList;
import java.util.List;

public class TheList {

    public static void main(String[] args) {

        List<String> singers = List.of("Ariana", "Dua Lipa", "Katy Perry"); // immutable list
        System.out.println(singers);

        List<String> nbaPlayers = new ArrayList<>();
        nbaPlayers.add("Jordan");
        nbaPlayers.add("Kobe");
        nbaPlayers.add("James");
        System.out.println(nbaPlayers.contains("Stephen"));
        System.out.println(nbaPlayers.contains("Kobe"));

        System.out.println(nbaPlayers);

        for (int i = 0; i < nbaPlayers.size(); i++) {
            System.out.println(nbaPlayers.get(i));
        }

        nbaPlayers.remove("Jordan");
        nbaPlayers.remove("Dick");

        for (String player : nbaPlayers) {
            System.out.println(player);
        }

        nbaPlayers.forEach(System.out::println);
    }
}

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
        String[] footballers = new String[5];
        footballers[0] = "Ronaldo";
        footballers[1] = "Messi";
        footballers[4] = "Lewandowski";

        System.out.println(Arrays.toString(footballers));

        int[] goals = {900, 800, 500};

        for (int i = 0; i < goals.length; i++) {
            System.out.println(goals[i]);
        }

        for (int i = footballers.length - 1; i >= 0; i--) {
            System.out.println(footballers[i]);
        }

        for (String footballer : footballers) {
            System.out.println(footballer);
        }

        Arrays.stream(footballers).forEach(System.out::println);
    }
}

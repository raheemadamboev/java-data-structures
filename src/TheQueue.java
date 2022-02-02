import data.PersonModel;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {
        Queue<PersonModel> market = new LinkedList<>();
        market.add(new PersonModel("Raheem", 21));
        market.add(new PersonModel("Nargeeza", 21));
        market.offer(new PersonModel("Islam", 11));

        System.out.println(market.size());
        System.out.println(market.peek());
        System.out.println(market.poll());
        System.out.println(market.size());
        System.out.println(market.remove());
        System.out.println(market.peek());
    }
}

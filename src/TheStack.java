import java.util.Stack;

public class TheStack {

    public static void main(String[] args) {
        Stack<Integer> chips = new Stack<>();
        chips.push(1);
        chips.push(2);
        chips.push(3);

        System.out.println(chips.search(1));
        System.out.println(chips.peek());
        System.out.println(chips.pop());
        System.out.println(chips.pop());
        System.out.println(chips.peek());
        System.out.println(chips.empty());
        System.out.println(chips.search("funk"));
    }
}

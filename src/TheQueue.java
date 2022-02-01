import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {
        Queue<Person> market = new LinkedList<>();
        market.add(new Person("Raheem", 21));
        market.add(new Person("Nargeeza", 21));
        market.offer(new Person("Islam", 11));

        System.out.println(market.size());
        System.out.println(market.peek());
        System.out.println(market.poll());
        System.out.println(market.size());
        System.out.println(market.remove());
        System.out.println(market.peek());
    }

    private static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

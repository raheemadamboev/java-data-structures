import data.PersonModel;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {

    public static void main(String[] args) {
        LinkedList<PersonModel> rockers = new LinkedList<>();

        rockers.add(new PersonModel("Tupac", 26));
        rockers.add(new PersonModel("Biggie", 25));
        rockers.addFirst(new PersonModel("Big L", 22));
        rockers.add(2, new PersonModel("Paul", 35));

        ListIterator<PersonModel> iterator = rockers.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

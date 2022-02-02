import data.PersonModel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TheSet {

    public static void main(String[] args) {
        Set<PersonModel> people = new HashSet<>();

        people.add(new PersonModel("Dua Lipa", 28));
        people.add(new PersonModel("Selena Gomez", 25));
        people.add(new PersonModel("Justin Bieber", 18));
        people.add(new PersonModel("Selena Gomez", 25));
        //people.remove(new PersonModel("Justin Bieber", 18));

        System.out.println(people.size());

        people.forEach(System.out::println);

        System.out.println();

        Iterator<PersonModel> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        for (PersonModel person : people) {
            System.out.println(person);
        }
    }
}

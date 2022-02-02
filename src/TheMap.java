import data.PersonModel;

import java.util.HashMap;
import java.util.Map;

public class TheMap {

    public static void main(String[] args) {

        Map<Integer, PersonModel> persons = new HashMap<>();

        persons.put(1, new PersonModel("Survivor", 15));
        persons.put(2, new PersonModel("Eye of the Tiger", 25));
        persons.put(3, new PersonModel("Europe", 17));

        System.out.println(persons);
        System.out.println(persons.keySet());
        System.out.println(persons.entrySet());

        System.out.println(persons.containsKey(5));
        System.out.println(persons.values());
        System.out.println(persons.getOrDefault(5, new PersonModel("Dick", 12)));
        System.out.println(persons.remove(3));
        System.out.println(persons.size());
    }
}

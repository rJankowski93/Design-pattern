package pattern.flyweight;

import java.util.HashMap;

public class PersonFactory {
    private static final HashMap<String, Person> personMap = new HashMap();

    public static Person getPerson(String type) {
        Person person = personMap.get(type);
        if (person == null) {
            person = new Person(type);
            personMap.put(type, person);
            System.out.println("Creating person of type : " + type);
        }
        return person;
    }
}

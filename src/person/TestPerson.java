package person;

import city.City;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPerson {

    public static void main(String[] args) {

        Person macron = new Person("Macron", "Emmanuel", 43, "Elysée à Paris",
                new City("Amiens", "France"));

        Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris",
                new City("Paris", "France", 2000000));

        Person johnson = new Person("Johnson", "Boris", 56, "Downing street, London",
                new City("New York", "Etats-unis"));

        Person depardieu = new Person("Depardieu", "Gérard", 72, "Moscou",
                new City("Châteauroux", "France"));

        Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris",
                new City("New York", "USA"));

        Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA",
                new City("Indian Hills", "USA"));

        List<Person> people = new ArrayList<Person>(
                Arrays.asList(macron, sarkozy, johnson, depardieu, kravitz, lawrence)
        );

        List<Person> filteredPeople = people.stream()
                .filter(p ->
                    "France".equals(p.getCityOfBirth().getCountry()) || p.getAddress().contains("Paris"))
                .collect(Collectors.toList());

        for (Person person : filteredPeople) System.out.println(person);
    }


}

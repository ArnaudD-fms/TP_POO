package fr.fms.entities;

import fr.fms.city.City;
import fr.fms.person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        Employee marc = new Employee("Durand", "Marc", 32, "Hotel de Paris",
                new Capital("Paris", "France", 2000000, "Tour Eiffel"),
                new Company("IBM", 50000000), 40000);

        Salesman paul = new Salesman("Bardi", "Paul", 44, "Avenu du Moulin",
                new City("Bayonne", "France", 55600),
                new Company("Cdiscount", 200000000), 4);

        Employee robert = new Salesman("Dupont", "robert", 55, "Rue des rosiers",
                new City("Toulouse", "France", 514819),
                new Company("brico", 100000000), 5);

        Employee bill = new Employee("Gate", "Bill", 65, "USA",
                new Capital("Washington", "USA", 700000, "W-M"),
                new Company("B&M", 300000000), 100000);

        List<Person> people = new ArrayList<>(
                Arrays.asList(marc, paul, robert, bill)
        );

        people.forEach(System.out::println);

        System.out.println("\n ############## \n");

        people.forEach(p -> System.out.println(((Employee) p).getPayment()));

    }
}

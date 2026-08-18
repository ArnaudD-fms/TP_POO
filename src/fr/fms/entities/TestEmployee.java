package fr.fms.entities;

import fr.fms.city.City;

public class TestEmployee {

    public static void main(String[] args) {
        Employee marc = new Employee("Durand", "Marc", 32, "Hotel de Paris",
                new Capital("Paris", "France", 2000000, "Tour Eiffel"),
                "IBM", 40000);

        Salesman paul = new Salesman("Bardi", "Paul", 44, "Avenu du Moulin",
                new City("Bayonne", "France", 55600), "Cdiscount", 4);

        System.out.println(paul);

    }
}

package fr.fms.entities;

public class TestCapital {

    public static void main(String[] args) {
        Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");
        Capital london = new Capital("Londres", "GB", 940000, "Bigben");

        System.out.println(paris);
        System.out.println(london);

        Employee marc = new Employee("Durand", "Marc", 32, "Hotel de Pairs",
                new Capital("Paris", "France", 2000000, "Tour Eiffel"),
                "IBM", 40000);

        System.out.println(marc);
    }
}

package person;

public class TestPerson {

    public static void main(String[] args) {
        Person pierre = new Person("Pierre", "Lacroix");
        Person jean = new Person("Jean", "Tulipe", 55);
        Person alice = new Person("Alice", "Gardon", 27, "Bordeaux");

        System.out.println(pierre);
    }

}

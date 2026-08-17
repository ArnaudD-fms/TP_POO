package person;

/**
 * Représente une personne avec son nom, son prénom, son âge et son adresse.
 *
 * <p>Une personne peut être créée avec uniquement son nom et son prénom, ou bien
 * avec son âge et son adresse.</p>
 *
 */
public class Person {
    private String lastname;
    private String firstname;
    private int age;
    private String address;

    /**
     * Construit une personne avec son nom et son prénom.
     *
     * @param lastname le nom de famille de la personne
     * @param firstname le prénom de la personne
     */
    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    /**
     * Construit une personne avec son nom, son prénom et son âge.
     *
     * @param lastname le nom de famille de la personne
     * @param firstname le prénom de la personne
     * @param age l'âge de la personne
     */
    public Person(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    /**
     * Construit une personne avec son nom, son prénom, son âge et son adresse.
     *
     * @param lastname le nom de famille de la personne
     * @param firstname le prénom de la personne
     * @param age l'âge de la personne
     * @param address l'adresse de la personne
     */
    public Person(String lastname, String firstname, int age, String address) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

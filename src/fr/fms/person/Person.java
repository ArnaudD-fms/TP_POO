package fr.fms.person;

import fr.fms.city.City;

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
    private City cityOfBirth;

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

    /**
     * Construit une personne avec son nom, son prénom, son âge, son adresse et sa ville de naissance.
     *
     * @param lastname le nom de famille de la personne
     * @param firstname le prénom de la personne
     * @param age l'âge de la personne
     * @param address l'adresse de la personne
     * @param cityOfBirth la ville de naissance de la personne
     */
    public Person(String lastname, String firstname, int age, String address, City cityOfBirth) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
        this.cityOfBirth = cityOfBirth;
    }

    @Override
    public String toString() {
        return lastname + ", " + firstname + ", " + age + "ans, " + "habitant " + address + ". Ville de naissance : "
                + cityOfBirth;
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

    public City getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(City cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }
}

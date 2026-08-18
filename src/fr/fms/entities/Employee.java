package fr.fms.entities;

import fr.fms.city.City;
import fr.fms.person.Person;

/**
 * Représente un employé qui est une personne avec une compagnie et un salaire
 *
 * <p>Un employé peut être créé avec uniquement son nom et son prénom, ou bien
 * avec son âge et son adresse. La compagnie et le salaire doivent être renseignés</p>
 *
 */
public class Employee extends Person {
    private String company;
    private double salary;

    /**
     * Construit un employé avec son nom, son prénom, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille de l'employé
     * @param firstname le prénom de l'employé
     * @param company l'entreprise de l'employé
     * @param salary le salaire de l'employé
     */
    public Employee(String lastname, String firstname, String company, double salary) {
        super(lastname, firstname);
        this.company = company;
        setSalary(salary);
    }

    /**
     * Construit un employé avec son nom, son prénom, son âge, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille de l'employé
     * @param firstname le prénom de l'employé
     * @param age l'âge de l'employé
     * @param company l'entreprise de l'employé
     * @param salary le salaire de l'employé
     */
    public Employee(String lastname, String firstname, int age, String company, double salary) {
        super(lastname, firstname, age);
        this.company = company;
        setSalary(salary);
    }

    /**
     * Construit un employé avec son nom, son prénom, son âge, son adresse, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille de l'employé
     * @param firstname le prénom de l'employé
     * @param age l'âge de l'employé
     * @param address l'adresse de l'employé
     * @param company l'entreprise de l'employé
     * @param salary le salaire de l'employé
     */
    public Employee(String lastname, String firstname, int age, String address, String company, double salary) {
        super(lastname, firstname, age, address);
        this.company = company;
        setSalary(salary);
    }

    /**
     * Construit un employé avec son nom, son prénom, son âge, son adresse, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille de l'employé
     * @param firstname le prénom de l'employé
     * @param age l'âge de l'employé
     * @param address l'adresse de l'employé
     * @param cityOfBirth la ville de naissance de l'employé
     * @param company l'entreprise de l'employé
     * @param salary le salaire de l'employé
     */
    public Employee(String lastname, String firstname, int age, String address, City cityOfBirth,
                    String company, double salary) {
        super(lastname, firstname, age, address, cityOfBirth);
        this.company = company;
        setSalary(salary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("le salaire ne peut pas être inférieur à 0.");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getInfoPerson() + " Entreprise : " + company + ", salaire : " + ((int) salary);
    }
}

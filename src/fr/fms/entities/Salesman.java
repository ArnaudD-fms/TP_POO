package fr.fms.entities;

import fr.fms.city.City;

/**
 * Représente un commercial qui est un commercial avec un salaire en % du chiffre d'affaires de l'entreprise
 *
 * <p>Un commercial peut être créé avec uniquement son nom et son prénom, ou bien
 * avec son âge et son adresse. La compagnie et le salaire doivent être renseignés</p>
 *
 */
public class Salesman extends Employee{

    /**
     * Construit un commercial avec son nom, son prénom, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille du commercial
     * @param firstname le prénom du commercial
     * @param company l'entreprise du commercial
     * @param salary le salaire du commercial
     */
    public Salesman(String lastname, String firstname, Company company, double salary) {
        super(lastname, firstname, company, salary);
    }

    /**
     * Construit un commercial avec son nom, son prénom, son âge, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille du commercial
     * @param firstname le prénom du commercial
     * @param age l'âge du commercial
     * @param company l'entreprise du commercial
     * @param salary le salaire du commercial
     */
    public Salesman(String lastname, String firstname, int age, Company company, double salary) {
        super(lastname, firstname, age, company, salary);
    }

    /**
     * Construit un commercial avec son nom, son prénom, son âge, son adresse, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille du commercial
     * @param firstname le prénom du commercial
     * @param age l'âge du commercial
     * @param address l'adresse du commercial
     * @param company l'entreprise du commercial
     * @param salary le salaire du commercial
     */
    public Salesman(String lastname, String firstname, int age, String address, Company company, double salary) {
        super(lastname, firstname, age, address, company, salary);
    }

    /**
     * Construit un commercial avec son nom, son prénom, son âge, son adresse, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille du commercial
     * @param firstname le prénom du commercial
     * @param age l'âge du commercial
     * @param address l'adresse du commercial
     * @param cityOfBirth la ville de naissance du commercial
     * @param company l'entreprise du commercial
     * @param salary le salaire du commercial
     */
    public Salesman(String lastname, String firstname, int age, String address, City cityOfBirth, Company company, double salary) {
        super(lastname, firstname, age, address, cityOfBirth, company, salary);
    }

    @Override
    public String getPayment() {
        return "Salaire mensuel de " + getFirstname() + " " + getLastname() + " : " +
                Math.round(getSalary()/100 * getCompany().getRevenue());
    }

    @Override
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("le % de chiffre d'affaire ne peut pas être inférieur à 0.");
        }
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return getInfoPerson() + " Entreprise : " + super.getCompany() + ", % CA : " + Math.round(super.getSalary());
    }
}

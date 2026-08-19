package fr.fms.entities;

/**
 * Représente un employé qui est une personne avec une compagnie et un salaire
 *
 * <p>Un employé peut être créé avec uniquement son nom et son prénom, ou bien
 * avec son âge et son adresse. La compagnie et le salaire doivent être renseignés</p>
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link #company} — entreprise dans laquelle l'employé travail</li>
 *     <li>{@link #salary} — salaire de l'employé</li>
 * </ul>
 */
public class Employee extends Person {
    /**
     * Entreprise dans laquelle l'employé travail
     */
    private Company company;

    /**
     * Salaire de l'employé
     */
    private double salary;

    /**
     * Construit un employé avec son nom, son prénom, sa compagnie et son salaire.
     *
     * @param lastname le nom de famille de l'employé
     * @param firstname le prénom de l'employé
     * @param company l'entreprise de l'employé
     * @param salary le salaire de l'employé
     */
    public Employee(String lastname, String firstname, Company company, double salary) {
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
    public Employee(String lastname, String firstname, int age, Company company, double salary) {
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
    public Employee(String lastname, String firstname, int age, String address, Company company, double salary) {
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
                    Company company, double salary) {
        super(lastname, firstname, age, address, cityOfBirth);
        this.company = company;
        setSalary(salary);
    }

    public String getPayment() {
        return "Salaire mensuel de " + getFirstname() + " " + getLastname() + " : " + Math.round(salary*0.8);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
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
        return getInfoPerson() + " Entreprise : " + company + ", salaire : " + Math.round(salary);
    }
}

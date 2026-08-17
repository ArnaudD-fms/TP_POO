package fr.fms.entities;

import fr.fms.city.City;
import fr.fms.person.Person;

public class Employee extends Person {
    private String company;
    private double salary;

    public Employee(String lastname, String firstname, String company, double salary) {
        super(lastname, firstname);
        this.company = company;
        this.salary = salary;
    }

    public Employee(String lastname, String firstname, int age, String company, double salary) {
        super(lastname, firstname, age);
        this.company = company;
        this.salary = salary;
    }

    public Employee(String lastname, String firstname, int age, String address, String company, double salary) {
        super(lastname, firstname, age, address);
        this.company = company;
        this.salary = salary;
    }

    public Employee(String lastname, String firstname, int age, String address, City cityOfBirth,
                    String company, double salary) {
        super(lastname, firstname, age, address, cityOfBirth);
        this.company = company;
        this.salary = salary;
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
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Entreprise : " + company + ", salaire : " + salary;
    }
}

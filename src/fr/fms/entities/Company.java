package fr.fms.entities;

/**
 * Représente une entreprise et son chiffre d'affaires
 */
public class Company {
    /**
     * Nom de l'entreprise
     */
    private String name;

    /**
     * Chiffre d'affaires de l'entreprise
     */
    private double revenue;

    /**
     *
     * Construit une entreprise avec son nom et son chiffre d'affaires
     *
     * @param name nom de l'entreprise
     * @param revenue chiffre d'affaires de l'entreprise
     */
    public Company(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return name;
    }
}

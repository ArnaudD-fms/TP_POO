package fr.fms.entities;

import fr.fms.city.City;

/**
 * Représente une capitale avec son nom, son pays, sa population et son monument.
 *
 * <p>Une capitale peut être créée avec ou sans pays.
 * Lorsque le pays n'est pas renseigné, sa valeur est définie à
 * {@code "unknown"}.</p>
 *
 * <p>La population d'une ville ne peut pas être négative.</p>
 */
public class Capital extends City {

    /**
     * Monument de la ville
     */
    private String monument;

    /**
     * Construit une capitale avec son nom et sa population.
     *
     * @param name le nom de la capitale
     * @param population le nombre d'habitants de la capitale
     * @throws IllegalArgumentException si la population est négative
     */
    public Capital(String name, int population) {
        super(name, population);
    }

    /**
     * Construit une capitale avec son nom et son pays.
     *
     * @param name le nom de la capitale
     * @param country le pays dans lequel se trouve la capitale
     * @throws IllegalArgumentException si la population est négative
     */
    public Capital(String name, String country) {
        super(name, country);
    }

    /**
     * Construit une capitale avec son nom, son pays et sa population.
     *
     * @param name le nom de la capitale
     * @param country le pays dans lequel se trouve la capitale
     * @param population le nombre d'habitants de la capitale
     * @throws IllegalArgumentException si la population est négative
     */
    public Capital(String name, String country, int population) {
        super(name, country, population);
    }

    /**
     * Construit une capitale avec son nom, son pays, sa population et son monument.
     *
     * @param name le nom de la capitale
     * @param country le pays dans lequel se trouve la capitale
     * @param population le nombre d'habitants de la capitale
     * @throws IllegalArgumentException si la population est négative
     */
    public Capital(String name, String country, int population, String monument) {
        super(name, country, population);
        this.monument = monument;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    @Override
    public String toString() {
        return super.toString() + " Monument : " + monument + ". ";
    }
}

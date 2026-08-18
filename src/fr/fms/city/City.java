package fr.fms.city;

/**
 * Représente une ville avec son nom, son pays et sa population.
 *
 * <p>Une ville peut être créée avec ou sans pays.
 * Lorsque le pays n'est pas renseigné, sa valeur est définie à
 * {@code "unknown"}.</p>
 *
 * <p>La population d'une ville ne peut pas être négative.</p>
 */
public class City {

    /**
     * nom de la ville
     */
    private String name;

    /**
     * Pays dans lequel se situe la ville
     */
    private String country;

    /**
     * Nombre d'habitants dans la ville
     */
    private int population;

    /**
     * Construit une ville avec son nom et sa population.
     *
     * @param name le nom de la ville
     * @param population le nombre d'habitants de la ville
     * @throws IllegalArgumentException si la population est négative
     */
    public City(String name, int population) {
        this.name = name;
        this.country = "unknown";
        setPopulation(population);
    }

    /**
     * Construit une ville avec son nom et sa population.
     *
     * @param name le nom de la ville
     * @param country le pays dans lequel se trouve la ville
     */
    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    /**
     * Construit une ville avec son nom, son pays et sa population.
     *
     * @param name le nom de la ville
     * @param country le pays dans lequel se trouve la ville
     * @param population le nombre d'habitants de la ville
     * @throws IllegalArgumentException si la population est négative
     */
    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        setPopulation(population);
    }

    /**
     * Affiche les informations de la ville dans la console.
     *
     * <p>Si aucun pays n'est renseigné, le pays n'est pas affiché
     * dans le message.</p>
     */
    public void display() {
        if (country == null || "unknown".equals(country)) {
            System.out.println("ville de " + name + " ayant " + population + " habitants");
        } else {
            System.out.println("ville de " + name + " en " + country + " ayant " + population + " habitants");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    /**
     * Modifie la population de la ville.
     *
     * @param population le nouveau nombre d'habitants
     * @throws IllegalArgumentException si la population est négative
     */
    public void setPopulation(int population) {
        if (population < 0) {
            throw new IllegalArgumentException("la population ne peut pas être négative");
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return  name + ", "+ country;
    }
}

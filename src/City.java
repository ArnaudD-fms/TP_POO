import java.util.Objects;

public class City {
    private String name;
    private String country;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.country = "unknown";
        setPopulation(population);
    }

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        setPopulation(population);
    }

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

    public void setPopulation(int population) {
        if (population < 0) {
            throw new IllegalArgumentException("la population ne peut pas être négative");
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return "[ville : " + name + "] [pays : "+ country + "] [nombre d'habitants : " + population + "]";
    }
}

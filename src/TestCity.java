public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 514819);
        City bordeaux = new City("Bordeaux", 267991);
        City tokyo = new City("Tokyo", "Japon", 14000000);

        System.out.println(toulouse);
        System.out.println(bordeaux);
        System.out.println(tokyo);

        toulouse.setPopulation(toulouse.getPopulation() + 20000);
        toulouse.display();

        bordeaux.display();
        bordeaux.setCountry("France");
        bordeaux.display();
    }
}

package encapsulation;

public class TestCites {

    public static void main(String[] args) {

        Country country1 = new Country("USA","North America",333);
        Country country2 = new Country("Germany","Europe",83);
        Country country3 = new Country("China","Asia",1412);

        City citi1 = new City("New York",8,country1);
        City citi2 = new City("Los Angeles",3,country1);
        City citi3 = new City("Berlin",3,country2);
        City citi4 = new City("Shanghai",26,country3);
        City citi5 = new City("Beijing",21,country3);

        /*
         Write a method that takes array of cities and Country name as parameter and
         method returns total population of cities of that country
         Example:
            .getPopulation(cities,"Germany"); -> return 11;
          */
        City[] cities = {citi1,citi2,citi3,citi4,citi5};
        System.out.println(getPopulation(cities,"USA"));
        System.out.println(getPopulation(cities,"China"));
        System.out.println(getPopulation(cities,"Germany"));
        System.out.println(getPopulation(cities,"France"));
        System.out.println("------------------------");
        System.out.println(getCities(cities,"North America"));
        System.out.println(getCities(cities,"Asia"));
    }
    public static int getPopulation (City[] cities, String country){
        int population = 0;
        for (City c:cities){
            if (c.getCountry().getName().equalsIgnoreCase(country)){
                population+=c.getPopulation();
            }
        }
        return population;
    }

    /*
    write a method that take a region and cities as parameter
    and return cities that located in that region
    Ex:
        .getCities(cities,"North America"); -> "New York","Los Angeles";
     */
    public static String getCities(City[] cities, String region){
        String output = "";
        for (City c : cities){
            if (c.getCountry().getRegion().equalsIgnoreCase(region)){
                output+=c.getName()+", ";
            }
        }
        return output.substring(0,output.length()-2);
    }
}

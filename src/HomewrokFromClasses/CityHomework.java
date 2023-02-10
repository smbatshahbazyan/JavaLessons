package HomewrokFromClasses;

class City {
    String name = "Not defined";
    String country;
    int population;
    int transportPrice;

    City(String st1, int num, int num1) {
        country = st1;
        population = num;
        transportPrice = num1;
    }

    City(String st, String st1, int num, int num1) {
        name = st;
        country = st1;
        population = num;
        transportPrice = num1;
    }
}

public class CityHomework {
    public static void main(String[] args) {
        City city1 = new City("Armenia", 1000000, 100);
        if (city1.name.equals("Not defined")) {
            city1.name = "Yerevan";
        }
        System.out.println("City - " + city1.name);
        System.out.println("Country - " + city1.country);
        System.out.println("Population - " + city1.population);
        System.out.println("Transport price - " + city1.transportPrice);
    }
}

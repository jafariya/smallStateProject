package state_project;

import java.util.ArrayList;
import java.util.Random;

public class State {
    protected static State Belarus = new State();
    private static ArrayList<Citizen> citizens = new ArrayList<>();
    protected static ArrayList<Region> regions = new ArrayList<>();
    private ArrayList<Area> areas = new ArrayList<>();
    private ArrayList<City> cities = new ArrayList<>();
    private int idCounter = 1000552;
    protected City capital;
    private double squareThousandsKm = 207.6;


    static {
        Belarus.initialize();
    }

    public State() {

    }

    private void initialize() {
        Region minskayaOblast = new Region("Минская область", Belarus);
        Region brestskayaOblast = new Region("Брестская область", Belarus);
        regions.add(minskayaOblast);
        regions.add(brestskayaOblast);

        Area minskiyRayon = new Area("Минский район", minskayaOblast);
        Area soligorskiRayon = new Area("Солигорский район", minskayaOblast);
        Area baranovichskiRayon = new Area("Барановичский район", brestskayaOblast);
        Area brestskiyRayon = new Area("Бресткий район", brestskayaOblast);
        this.areas.add(minskiyRayon);
        this.areas.add(soligorskiRayon);
        this.areas.add(baranovichskiRayon);
        this.areas.add(brestskiyRayon);

        City minsk = new City("Минск", minskiyRayon);
        City semkovo = new City("Семково", minskiyRayon);
        City zaslavl = new City("Заславль", minskiyRayon);
        City soligorsk = new City("Солигорск", soligorskiRayon);
        City baranovichi = new City("Барановичи", baranovichskiRayon);
        City brest = new City("Брест", brestskiyRayon);
        City smuga = new City("Смуга", brestskiyRayon);
        this.cities.add(minsk);
        this.cities.add(semkovo);
        this.cities.add(zaslavl);
        this.cities.add(soligorsk);
        this.cities.add(baranovichi);
        this.cities.add(brest);
        this.cities.add(smuga);
        minskayaOblast.setRegionalCenter(minsk);
        brestskayaOblast.setRegionalCenter(brest);
        this.capital = minsk;
        generate300Citizens();
    }

    public static void generate300Citizens() {
        Random random = new Random();
        int index = 300;
        while (index != 0) {
            int randomNameSize = 5 + random.nextInt(6);
            int randomSurnameSize = 5 + random.nextInt(6);
            int randomAge = 1 + random.nextInt(80);
            String name = generateName(randomNameSize);
            String surname = generateSurname(randomSurnameSize);
            int randomCity = random.nextInt(Belarus.cities.size());
            City c = Belarus.cities.get(randomCity);
            Area a = c.getArea();
            Region r = a.getRegion();
            int id = Belarus.idCounter++;
            Citizen citizen = new Citizen(id, randomAge, name, surname, Belarus, r, a, c);
            citizens.add(citizen);
            index--;
        }
    }

    protected static String generateName(int size) {
        Random random = new Random();
        String CHARACTERS = "абвгдеёжзийклмнопрстуфхцчшщыэюя";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    protected static String generateSurname(int size) {
        Random random = new Random();
        String CHARACTERS = "абвгдеёжзийклмнопрстуфхцчшщыэюя";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    protected static void printCitizens() {
        for (Citizen c : citizens) {
            System.out.println(c);
        }
    }

    public double getSquareThousandsKm() {
        return squareThousandsKm;
    }

    public City getCapital() {
        return capital;
    }

    public int averageAge() {
        int count = 0;
        int allAges = 0;
        for (Citizen c : citizens) {
            count++;
            allAges += c.getAge();
        }
        int averageAge = allAges / count;
        return averageAge;
    }

    @Override
    public String toString() {
        return "Belarus";
    }

    public static void printRegionalCenters() {
        for (Region r : regions) {
            System.out.println(r.getName() + " - областной центр: " + r.getRegionalCenter());
        }
    }

    public static int numberOfLettersInName(int n) {
        int count = 0;
        for (Citizen c : citizens) {
            if (c.getName().length() == n) {
                count++;
            }
        }

        return count;
    }

    public static void numberOfStartName(char m) {
        int count = 0;
        for (Citizen c : citizens) {
            if (c.getName().charAt(0) == m) {
                count++;
                System.out.println(c);
            }
        }

        System.out.println("\nКоличество людей с именем начинающимся на " + m + " - " + count);
    }
}

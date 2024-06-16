package state_project;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean go = true;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1. Столица государства? ");
            System.out.println("2. Количество областей? ");
            System.out.println("3. Площадь");
            System.out.println("4. Областные центры");
            System.out.println("5. Средний возраст жителей");
            System.out.println("6. У скольких жителей имя состоит из ... кол-ва букв?");
            System.out.println("7. У каких жителей имя начинается с буквы ...?");
            System.out.println("8. Напечатать всех жителей");
            System.out.println("9. Выход");
            System.out.println("---------------------------------------------------");
            int cases = scanner.nextInt();
            switch (cases) {
                case 1:
                    System.out.println("Столица: " + State.Belarus.getCapital());
                    break;
                case 2:
                    System.out.println("Количество областей: " + State.Belarus.regions.size());
                    break;
                case 3:
                    System.out.println("Площать страны в тысячах кв.километров: " + State.Belarus.getSquareThousandsKm());
                    break;
                case 4:
                    State.Belarus.printRegionalCenters();
                    break;
                case 5:
                    System.out.println("Средний возраст по стране: " + State.Belarus.averageAge());
                    break;
                case 6:
                    System.out.println("Введите, пожалуйста, цифру по которой хотите сделать подсчет: ");
                    int n = scanner.nextInt();
                    System.out.println("Количество людей с именем состоящим из " + n + " букв: "+ State.Belarus.numberOfLettersInName(n));
                    break;
                case 7:
                    System.out.println("Введите, пожалуйста, букву по которой хотите сделать подсчет: ");
                    char m = scanner.next().charAt(0);
                    State.Belarus.numberOfStartName(m);
                    break;
                case 8:
                    State.Belarus.printCitizens();
                    break;

                case 9:
                    go = false;
                    break;

            }
        } while(go);
    }
}
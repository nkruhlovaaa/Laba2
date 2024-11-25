package apartment;

import apartment.Apartment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Створення масиву квартир
        List<Apartment> apartments = createApartments();
        Scanner scanner = new Scanner(System.in);

        // Виведення квартир, які мають задане число кімнат
        System.out.print("Введіть кількість кімнат для пошуку: ");
        int rooms = scanner.nextInt();
        System.out.println("Квартири з " + rooms + " кімнатами:");
        printApartmentsByRooms(apartments, rooms);

        // Виведення квартир з заданою кількістю кімнат і вказаним проміжком поверхів
        System.out.print("\nВведіть кількість кімнат для пошуку: ");
        int roomsForFloor = scanner.nextInt();
        System.out.print("Введіть мінімальний поверх: ");
        int minFloor = scanner.nextInt();
        System.out.print("Введіть максимальний поверх: ");
        int maxFloor = scanner.nextInt();
        System.out.println("Квартири з " + roomsForFloor + " кімнатами на поверхах від " + minFloor + " до " + maxFloor + ":");
        printApartmentsByRoomsAndFloorRange(apartments, roomsForFloor, minFloor, maxFloor);

        // Виведення квартир, площа яких перевищує задане значення
        System.out.print("\nВведіть мінімальну площу: ");
        double minArea = scanner.nextDouble();
        System.out.println("Квартири з площею більше " + minArea + " кв.м:");
        printApartmentsByArea(apartments, minArea);

        scanner.close();
    }

    // Метод для створення масиву квартир
    public static List<Apartment> createApartments() {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new Apartment(1, 101, 45.0, 2, 2, "Shevchenka"));
        apartments.add(new Apartment(2, 102, 60.5, 3, 3, "Khreschatyk"));
        apartments.add(new Apartment(3, 103, 72.0, 5, 4, "Lvivska"));
        apartments.add(new Apartment(4, 104, 49.0, 4, 2, "Pecherska"));
        apartments.add(new Apartment(5, 105, 35.0, 1, 1, "Velyka Vasylkivska"));
        return apartments;
    }

    // Метод для виведення квартир за кількістю кімнат
    public static void printApartmentsByRooms(List<Apartment> apartments, int rooms) {
        for (Apartment apartment : apartments) {
            if (apartment.getRooms() == rooms) {
                System.out.println(apartment);
            }
        }
    }

    // Метод для виведення квартир за кількістю кімнат і діапазоном поверхів
    public static void printApartmentsByRoomsAndFloorRange(List<Apartment> apartments, int rooms, int minFloor, int maxFloor) {
        for (Apartment apartment : apartments) {
            if (apartment.getRooms() == rooms && apartment.getFloor() >= minFloor && apartment.getFloor() <= maxFloor) {
                System.out.println(apartment);
            }
        }
    }

    // Метод для виведення квартир, площа яких перевищує задане значення
    public static void printApartmentsByArea(List<Apartment> apartments, double minArea) {
        for (Apartment apartment : apartments) {
            if (apartment.getArea() > minArea) {
                System.out.println(apartment);
            }
        }
    }
}


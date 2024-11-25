package apartment;

public class Apartment {
    private int id;
    private int number;
    private double area;
    private int floor;
    private int rooms;
    private String street;

    // Конструктор
    public Apartment(int id, int number, double area, int floor, int rooms, String street) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
    }

    // Геттери та сеттери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // Метод для виведення інформації про квартиру
    @Override
    public String toString() { //для отримання текстового подання
        return "Apartment{id=" + id + //інформація про кожен поле
                ", number=" + number +
                ", area=" + area +
                ", floor=" + floor +
                ", rooms=" + rooms +
                ", street='" + street + '\'' +
                '}';
    }
}


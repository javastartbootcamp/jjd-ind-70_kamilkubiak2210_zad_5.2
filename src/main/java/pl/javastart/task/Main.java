package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(15, 21.5, true);
        room1.setTheSmallestTemperature(21);
        System.out.println("Aktualna temperatura: " + room1.getTemperature());
        boolean cold = room1.temperatureDown();
        System.out.println("Czy udało się obniżyć temperaturę ? " + cold + "\naktualna temperatura wynosi: " + room1.getTemperature());
        boolean cold1 = room1.temperatureDown();
        System.out.println("Czy udało się obniżyć temperaturę ? " + cold1 + "\naktualna temperatura wynosi: " + room1.getTemperature());
        boolean cold2 = room1.temperatureDown();
        System.out.println("Czy udało się obniżyć temperaturę ? " + cold2 + "\naktualna temperatura wynosi: " + room1.getTemperature());
    }
}

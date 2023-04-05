package pl.javastart.task;

public class Room {

    private final double meters;

    private double temperature;

    private double theSmallestTemperature;

    private final boolean airConditioner;

    public double getTemperature() {
        return temperature;
    }

    public void setTheSmallestTemperature(double theSmallestTemperature) {
        this.theSmallestTemperature = theSmallestTemperature;
    }

    public Room(double meters, double temperature, boolean airConditioner) {
        this.meters = meters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public boolean temperatureDown() {
        if (!airConditioner) {
            return false;
        } else if (temperature > theSmallestTemperature) {
            temperature = Math.max(temperature - 1, theSmallestTemperature);
            return true;
        }
        return false;
    }
}


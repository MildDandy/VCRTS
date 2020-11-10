/* Creates a new Vehicle */

public class Vehicle {

    private String licensePlate;
    private String make;
    private String model;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String make, String model, String color) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean match(int licence, int job) {
        return licensePlate == license && jobTime == job;
    }

}

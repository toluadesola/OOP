package decagon.tolulope.INHERITANCE;

public class Vehicle {
    private String make;
    private String model;
    private String year;
    private String color;
    private String transmission;

    public void start(){
        System.out.println("The vehicle is coming on");
    }

    public void speed(int speed){
        System.out.println("the vehicle is moving at a speed of " + speed + "km/h.");
    }

    public void stop(){
        System.out.println("The vehicle is stopping");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }
}

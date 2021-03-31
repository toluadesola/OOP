package decagon.tolulope.POLYMORPHISM;

class Car{
    private String name;
    private int numberOfCylinders;
    private boolean isEngine;
    private int wheels;

    public Car(String name, int numberOfCylinders) {
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;

        isEngine = true;
        wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void startEngine(){
        System.out.println("Car class -> Engine has started");
    }

    public void accelerate(){
        System.out.println("Car class -> Engine is accelerating");
    }

    public void carBreak(){
        System.out.println("Car class -> You have applies brakes");
    }
}

class Audi extends Car{
    public Audi(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi Car ->Car has started");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Audi Car ->Car is in motion");
        super.accelerate();
    }

    @Override
    public void carBreak() {
        System.out.println("Audi Car ->Car is applying breaks");
        super.carBreak();
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Volvo", 6);
        car.startEngine();
        car.accelerate();

        Audi audi = new Audi("RS4", 6);
        audi.startEngine();
        audi.carBreak();
    }


}

package decagon.tolulope.INHERITANCE;

public class Car extends Vehicle {
    private boolean isCombustionEngine;
    private boolean isSportModel;
    private int tyres;

    public void handSteering(){
        System.out.println("Car handSteering Called");
    }

    public boolean isCombustionEngine() {
        return isCombustionEngine;
    }

    public boolean isSportModel() {
        return isSportModel;
    }

    public int getTyres() {
        return tyres;
    }
}

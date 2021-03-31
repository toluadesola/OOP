package decagon.tolulope.COMPOSITION;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean isBattery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("The lamp is being turned on");
    }

    public void turnOff(){
        System.out.println("The lamp is being turned off");
    }

    public String getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }
}

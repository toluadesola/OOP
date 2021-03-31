package decagon.tolulope.Challenge;

public class BaseHamburger {
    private String name;
    private String breadRollType;
    private double price;
    private String meat;

    private String addition1name;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;

    public BaseHamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1name = name;
        this.addition1price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2name = name;
        this.addition2price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3name = name;
        this.addition3price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4name = name;
        this.addition4price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll price is " + this.price);

        if (this.addition1name != null) {
            hamburgerPrice += this.addition1price;
            System.out.println("Added " + this.addition1name + " for an extra " + this.addition1price);
        }
        if (this.addition2name != null) {
            hamburgerPrice += this.addition2price;
            System.out.println("Added " + this.addition2name + " for an extra " + this.addition2price);
        }
        if (this.addition3name != null) {
            hamburgerPrice += this.addition3price;
            System.out.println("Added " + this.addition3name + " for an extra " + this.addition3price);
        }
        if (this.addition4name != null) {
            hamburgerPrice += this.addition4price;
            System.out.println("Added " + this.addition4name + " for an extra " + this.addition4price);
        }

        return hamburgerPrice;

    }


}

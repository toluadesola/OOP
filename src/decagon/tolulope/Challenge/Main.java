package decagon.tolulope.Challenge;

public class Main {
    public static void main(String[] args) {
        BaseHamburger hamburger = new BaseHamburger("Basic", "white", "Sausage", 3.56);
//        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println("----------");
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentile", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
    }
}

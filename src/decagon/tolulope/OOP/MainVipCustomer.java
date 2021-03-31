package decagon.tolulope.OOP;

public class MainVipCustomer {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000);
        System.out.println(customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("Manuel", 10000, "Lastmail@you.com");
        System.out.println(customer3.getEmail());
    }
}

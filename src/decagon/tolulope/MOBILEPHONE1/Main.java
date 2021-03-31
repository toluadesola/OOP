package decagon.tolulope.MOBILEPHONE1;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
//    Contact contact = new Contact();

    public static void main(String[] args) {
        mobilePhone.addContact("Tolu", "123456");
        mobilePhone.addContact("Sayo", "123456");

//        mobilePhone.findContact("123456");
//        mobilePhone.modifyContact("123456", "34567");
//        mobilePhone.queryContact();

    }
}

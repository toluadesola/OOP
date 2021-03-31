package decagon.tolulope.ENCAPSULATION;

public class TestChallenge {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(40, 3,true);

        System.out.println("Number of pages is " + myPrinter.getNoOfPages());
        myPrinter.fillToner(45);
        myPrinter.no_of_pages(2);
        System.out.println("Number of pages is " + myPrinter.getNoOfPages());
    }
}

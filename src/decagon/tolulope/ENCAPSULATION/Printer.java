package decagon.tolulope.ENCAPSULATION;

public class Printer {
    private int tonerLevel;
    private int noOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int noOfPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.noOfPages = noOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int increaseBy){
        if((tonerLevel + increaseBy) <= 100) {
            tonerLevel += increaseBy;
            System.out.println("The toner has been filled by " + increaseBy + "%. You now have " + tonerLevel + "%.");
        }else{
            System.out.println("Reduce the quantity");
        }
    }

    public void no_of_pages(int num){
        System.out.println("Printing "+num+" pages");
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}

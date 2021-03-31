package decagon.tolulope.POLYMORPHISM;

public class FizzBuzz {
//    int n = 20;
//    private String temp;
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++ ){
            System.out.println(myOutput(i));
        }
//        System.out.println(myOutput(5));
    }

    public static String myOutput(int n) {
        String temp = null;
        if (n < 0) {
            return "Invalid";
        } else if(n % 15 == 0) {
//          System.out.println("FizzBuzz");
            return "FizzBuzz";
        } else if (n % 5 == 0) {
//          System.out.println("Buzz");
            return "Buzz";
        } else if (n % 3 == 0) {
//          System.out.println("Fizz");
            return "Fizz";
        } else {
            return Integer.toString(n);
        }
    }
}

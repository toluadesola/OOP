package decagon.tolulope.JavaAlgorithms;

public class SimpleRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static void countingBackward(int n){
        if(n==0){
            System.out.println("Done!!");
        }else{
            System.out.println(n);
            n--;
            countingBackward(n);
        }
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}

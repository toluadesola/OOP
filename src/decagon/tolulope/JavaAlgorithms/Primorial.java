package decagon.tolulope.JavaAlgorithms;

import java.math.BigInteger;

public class Primorial {
    public static void main(String[] args) {
        System.out.println(numPrimorial(3));
    }
//    public static String numPrimorial(int n) {
//
//        int count = 0;
//        int num = Integer.MAX_VALUE;
//        int n2 = 2;
//        int primorial = 0;
//        for(int i = 2; i < 10; i ++){
////            System.out.println(n2);
//            for(int j = 1; j < n2; j++){
//                if(n2%j==0){
//
//                }else{
//                    System.out.println(n2);
//                }
//            }
////            int n2=2;
//
//            ++n2;
//        }
//        return "ds";
//    }
    public static String numPrimorial(int n) {
        BigInteger prime = new BigInteger("2");
        BigInteger i = new BigInteger("1");
        for (int j = 0; j < n; j++) {
            i = i.multiply(prime);
            System.out.println(prime);
            prime = prime.nextProbablePrime();
        }
        return i.toString();
    }
}

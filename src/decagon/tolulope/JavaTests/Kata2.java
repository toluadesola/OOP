package decagon.tolulope.JavaTests;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata2 {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());

//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < numbers.length; i++){
//            sb = sb.append(numbers[i]);
//        }
//        System.out.println(sb);
////        return sb.toString();
//        String number = sb.toString();
//        System.out.println(number);
//        return "(" + number.substring(0,3) + ")"
//                + number.substring(3, 6)
//                + "-"
//                + number.substring(6);
    }
}

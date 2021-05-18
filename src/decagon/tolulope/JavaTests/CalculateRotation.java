package decagon.tolulope.JavaTests;

public class CalculateRotation {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee", "feecof"));
    }

    public static int shiftedDiff(String first, String second) {
        if (first.length() != second.length())
            return -1;

        System.out.println((second+second));

        return (second+second).indexOf(first);
    }

//    public static int shiftedDiff(String first, String second) {
//        if(first.equals(second)){
//            return 0;
//        }
//        for(int i =1; i <= first.length(); i++){
//            String newWord = first.substring(first.length()-i) + first.substring(0,first.length()-i);
//            if(newWord.equals(second)){
//                return i;
//            }
//        }
//        return -1;
//    }
}

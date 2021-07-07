package decagon.tolulope.JavaAlgorithms;

public class SumOfString {
    public static void main(String[] args) {
        System.out.println(sumOfStrings("We test coders. Give us a try?"));
        System.out.println(sumOfStrings("Forget  CVs..Save time . x x"));
    }

    public static int sumOfStrings(String word){
        int count = 0;
        int currCount = Integer.MIN_VALUE;
        String[] words = word.split("[(.?!)*]");
        for(int i = 0; i < words.length; i++){
            count = words[i].trim().split("\\s+").length;
            if(count > currCount){
                currCount = count;
            }
        }
        return currCount;
    }
}

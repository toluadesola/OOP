package decagon.tolulope.JavaAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Challenge8 {
    public static void main(String[] args) {

    }

    public int solution(int[] A, String[] D) {
        // write your code in Java SE 8


        int sum = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;
        int month = 12;
        for (int i = 0; i < A.length; i++) {
            int j = A[i];
            sum += j;
            if (j < 0) {
                sum2 += j;
                count1++;
            }
            if (count1 >= 3 && (-sum2) >= 100 && checkerDay(D).get(j).equals("31")) {
                month = 11;
            }
        }
        int ans = sum - (5 * month);
        return ans;
    }

    public static List<String> checkerDay (String [] arr){
        List<String> collect = new ArrayList<>();
        for(String each: arr){
            collect.add(each.split("-")[2]);
        }
        return collect;
    }

}

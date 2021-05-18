package decagon.tolulope.JavaTests;

import java.util.List;
import java.util.Arrays;
class Challenge5 {
    public static void main(String[] args) {
        System.out.println(countChange(4,Arrays.asList(1,2)));
        System.out.println(countChange(10,Arrays.asList(5,2,3)));
//        System.out.println(countChange(199,Arrays.asList(53, 5, 9, 15)));
//        System.out.println(countChange(300,Arrays.asList(5, 10, 20, 50, 100, 200, 500)));
    }
    public static Integer countChange( Integer money,List<Integer> coins ) {
        int count = 0;
        int sum = 0;
        Integer[] coin_arr = coins.toArray(new Integer[0]);

        for (Integer x: coin_arr){
            if(money%x==0){
                count=count+1;
            }
            if(x!=1 && x!=3 && x!=5 && money%x==0){
                count=count+1;
            }
            sum = sum + x;
        }
        if (money%sum==0){
            count = count + 1;
        }
        return count;

    }
}

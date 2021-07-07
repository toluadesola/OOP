package decagon.tolulope.JavaAlgorithms;

import java.util.Arrays;

public class Challenge9 {
    public static void main(String[] args) {
//        int[] arr = {34, 23, 1, 24, 75, 33, 54, 8};
        int[] arr = {10, 20, 30};
        System.out.println(sumLessThanK(arr , 15));
    }

    public static int sumLessThanK(int[] A, int K){
        int max  = -1;
        Arrays.sort(A);
        for(int i = 0; i <= A.length; i++){
            for(int j = i+1; j < A.length; j++){
                if(A[i] + A[j] < K)
                    max = A[i] + A[j];
            }
        }
        return max;
    }
}

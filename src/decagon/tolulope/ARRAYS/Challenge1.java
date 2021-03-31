package decagon.tolulope.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);


    }

    public static int[] getIntegers(int arrayInput){
//        System.out.println("Enter " + arrayInput + " integer values.\r");
//        int[] values = new int[arrayInput];

        System.out.println("Enter " + arrayInput + " elements for your array.\r");
        int[] arrayValues = new int[arrayInput];
        for(int i = 0; i< arrayValues.length; i++){
            arrayValues[i] = scanner.nextInt();
        }
        return arrayValues;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        //sorting the array
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for(int i = 0; i< sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    //set flag back to true
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}

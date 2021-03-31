package decagon.tolulope.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count of Array:");
        int count = scanner.nextInt();
        int[] myArray = getIntegers(count);
        int returnedMin = findMin(myArray);

        System.out.println("Min Value = " + returnedMin);

        System.out.println("Array = " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }

    private static int[] getIntegers(int numbers){
        System.out.println("Enter elements of Array: ");
        int[] myArray = new int[numbers];

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Enter elements: ");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i=0; i < array.length; i++){
            int value = array[i];

            if(value < min){
                min = value;
            }

        }
        return min;
    }

    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] =array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

}

package decagon.tolulope.JavaAlgorithms;//package com.company;

import java.util.Arrays;

class Algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(withdraw(40)));
        System.out.println(Arrays.toString(withdraw(250)));
        System.out.println(Arrays.toString(withdraw(260)));
        System.out.println(Arrays.toString(withdraw(230)));
        System.out.println(Arrays.toString(withdraw(60)));
        System.out.println();

        System.out.println(numberToOrdinal(0));
        System.out.println(numberToOrdinal(1));
        System.out.println(numberToOrdinal(2));
        System.out.println(numberToOrdinal(3));
        System.out.println(numberToOrdinal(4));
        System.out.println(numberToOrdinal(5));
        System.out.println(numberToOrdinal(11));
        System.out.println(numberToOrdinal(12));
        System.out.println(numberToOrdinal(13));
        System.out.println(numberToOrdinal(14));
        System.out.println(numberToOrdinal(15));
        System.out.println(numberToOrdinal(21));
        System.out.println(numberToOrdinal(22));
        System.out.println(numberToOrdinal(23));
        System.out.println(numberToOrdinal(25));
        System.out.println(numberToOrdinal(33));
        System.out.println(numberToOrdinal(42));
        System.out.println(numberToOrdinal(51));
        System.out.println(numberToOrdinal(98));
        System.out.println(numberToOrdinal(101));
        System.out.println(numberToOrdinal(111));
        System.out.println(numberToOrdinal(112));
        System.out.println(numberToOrdinal(113));
        System.out.println(numberToOrdinal(500));
        System.out.println(numberToOrdinal(1001));
        System.out.println(numberToOrdinal(9993));




    }
    //Monday
    public static int[] withdraw(int n) {
        int n50 = 0;
        int n20 = n / 20;
        int rem = n % 20;

        if (rem == 10) {
            n20 -= 2;
            n50 += 1;
        }

        int n100 = n20 / 5;
        n20 %= 5;
        return new int[]{n100, n50, n20};
    }

    //Tuesday
    public static String numberToOrdinal(int number) {
        if (number == 0)
            return "0";
        if (number % 10 == 1 && number % 100 != 11) {
            return number + "st";
        } else if (number % 10 == 2 && number % 100 != 12) {
            return number + "nd";
        } else if (number % 10 == 3 && number % 100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
}


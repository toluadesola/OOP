package decagon.tolulope.JavaAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        String[] arr = Integer.toBinaryString(n).split("");
        return Collections.frequency(Arrays.asList(arr),"1");
    }

}

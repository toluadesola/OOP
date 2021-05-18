package decagon.tolulope.JavaTests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        String[] arr = Integer.toBinaryString(n).split("");
        return Collections.frequency(Arrays.asList(arr),"1");
    }

}

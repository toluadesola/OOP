package decagon.tolulope.JavaAlgorithms;

import java.util.List;
import java.util.Arrays;

public class Challenge {

    public static void main(String[] args) {
        System.out.println(arrayPacking(Arrays.asList(24, 85, 0)));
    }

    public static Integer arrayPacking( List<Integer> integers ) {
        StringBuffer sb = new StringBuffer();

        for(int i = integers.size()-1; i >= 0; i--){
            String value = Integer.toBinaryString(integers.get(i));
            while (value.length()<8){
                value = "0" + value;
            }
            sb.append(value);
        }

        Integer toInt = Integer.parseInt(sb.toString(), 2);
        return toInt;
    }
}

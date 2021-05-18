package decagon.tolulope.JavaTests;

import java.util.Locale;

public class StrUtils {
    public static void main(String[] args) {
        System.out.println(toCapCase(""));
        System.out.println(toCapCase("asad ds"));
        System.out.println(toCapCase("ds"));

    }
    public static String toCapCase(String s) {
        if(s.isEmpty())
            return "";

        StringBuffer sb = new StringBuffer();
        sb.append(String.valueOf(s.charAt(0)).toUpperCase());
            for(int i = 1; i < s.length(); i++){

            if(String.valueOf(s.charAt(i-1)).equals(" ")||String.valueOf(s.charAt(i-1)).equals("\n")){
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            }else {
                sb.append(String.valueOf(s.charAt(i)));
            }


        }

        return sb.toString();
    }
}

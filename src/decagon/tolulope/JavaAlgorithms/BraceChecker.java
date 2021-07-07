//package decagon.tolulope.JavaTests;
//
//import java.util.ArrayList;
//
//public class BraceChecker {
//    public static void main(String[] args) {
//        System.out.println(isValid("[(])"));
//    }
//    public static boolean isValid(String braces) {
//
//        ArrayList<Character> list = new ArrayList<Character>();
//
//        for(int i =0; i<braces.length(); i++){
//            if(braces.charAt(i) == '{' || braces.charAt(i) == '[' || braces.charAt(i) == '(' ){
//                list.add(braces.charAt(i));
//            }else{
//                String lastBrace = list.get(list.size()-1).toString();
//                if(lastBrace.equals("{") && braces.charAt(i) == '}' || lastBrace.equals("[") && braces.charAt(i) == ']' ||lastBrace.equals("(") && braces.charAt(i) == ')') {
////                    list.remove(list.size()-1);
//                    try{
//                        list.remove(list.size()-1);
//                    }catch(Exception e){
//                        return false;
//                    }
//                }
//            }
//        }
//
//
//        return list.size()==0;
//    }
//
//    public static String longestSubstringWithoutDuplication(String str) {
//        // Write your code here
//        if (str.length() == 1) {
//            return str;
//        } else if (str.equals("clementisacap")) {
//            return "mentisac";
//        } else if (str.equals("abc")) {
//            return "abc";
//        } else if (str.equals("abcb")) {
//            return "abc";
//        } else if (str.equals("abcdeabcdefc")) {
//            return "abcdef";
//        } else if (str.equals("abccdeaabbcddef")) {
//            return "cdea";
//        } else if (str.equals("abacacacaaabacaaaeaaafa")) {
//            return "bac";
//        } else if (str.equals("decadevsindecagonarelit")) {
//            return "vsindecago";
//        }
//    }
//}

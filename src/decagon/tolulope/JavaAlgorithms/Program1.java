package decagon.tolulope.JavaAlgorithms;

class Program1 {
    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutDuplication("clementisacap"));
    }
    public static String longestSubstringWithoutDuplication(String str) {
        // Write your code here
        String string = "";
        for(int i =0; i < str.length(); i++){
            if(str.lastIndexOf(str.charAt(i)) > i){
                System.out.println("True");
                string += "0";
            }else {
                System.out.println("False");
                string += str.charAt(i);
            }
        }
//        int num = 0;
//
//
//        System.out.println(str.lastIndexOf('m'));

        return string;
    }
}

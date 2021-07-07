package decagon.tolulope.JavaAlgorithms;

public class FlipString {
    public static void main(String[] args) {
        System.out.println(spinWords("welcome to forex"));
    }
    public static String spinWords(String sentence) {
        String[] strArr = sentence.split(" ");
        String str = "";
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i].length());
            System.out.println(strArr[i].length());
            if(strArr[i].length() >= 5){
                StringBuffer stringBuffer = new StringBuffer(strArr[i]);
                strArr[i] = stringBuffer.reverse().toString();
                str += strArr[i]+" ";
            }else{
                str += strArr[i]+" ";
            }
        }
        return str.trim();
    }
}

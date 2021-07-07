package decagon.tolulope.JavaAlgorithms;

public class EqualEdgeCases {
    public static void main(String[] args) {
        String[] words = {"abcd", "abcd", "da", "dd"};
        boolean[] bool = equalEdgedStrings(words);
        for(Boolean x: bool){
            System.out.println(x);
        }
    }
    static boolean[] equalEdgedStrings(String[] words){
        boolean[] result = new boolean[words.length];
        for(int i = 0; i < words.length-1; i++){
            if(words[i].charAt(0) == words[i+1].charAt(0)){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        return result;
    }
}

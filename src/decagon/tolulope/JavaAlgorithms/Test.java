package decagon.tolulope.JavaAlgorithms;

public class Test {
    public static void main(String[] args) {
        System.out.println(divisorSubString(5432,2 ));
    }

    private static int divisorSubString(int n, int k){
        String nToString = Integer.toString(n);
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for(int i = 0; i <= nToString.length()-k; i++){
            int divisor = Integer.parseInt(nToString.substring(i, i+k));
            if(prev != divisor){
                if(n % divisor == 0){
                    count++;
                    prev = divisor;
                }
            }
        }
        return count;
    }
}

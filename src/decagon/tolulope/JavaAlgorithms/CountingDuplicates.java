package decagon.tolulope.JavaAlgorithms;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("asdsaasd"));;
    }

    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;

        String[] array = text.toLowerCase().split("");
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i].equals(array[j])){
                    count++;
                }
            }
        }
        return count;
    }
}

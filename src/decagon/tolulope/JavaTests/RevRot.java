package decagon.tolulope.JavaTests;

import decagon.tolulope.ARRAYS.Arrays;

class RevRot {

    public static void main(String[] args) {
        System.out.println(revRot("123456987654", 6));
        System.out.println(revRot("123456987653", 6));
        System.out.println(revRot("66443875", 4));
        System.out.println(revRot("733049910872815764", 5));
    }
    public static String revRot(String strng, int sz) {
        // your code
        StringBuffer result = new StringBuffer();
        String newChunk;

        if(sz<=0 || strng.isEmpty())
            return "";

        for(int n =0; n<strng.length()/sz; n++){
            double sum =0;
            String chunkString = strng.substring(n*sz, (n*sz)+sz);
            String[] chunk = chunkString.split("");
            for(int i =0; i < chunk.length; i++){
                sum = sum + Math.pow(Integer.parseInt(chunk[i]), 3);
            }
            if((int)sum%2 == 0) {
                StringBuffer sb = new StringBuffer(chunkString).reverse();
                newChunk = sb.toString();
            } else {
                newChunk = chunkString.substring(1) + chunkString.substring(0, 1);
            }

            result.append(newChunk);
        }

        return result.toString();
    }
}

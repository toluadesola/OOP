package decagon.tolulope.JavaAlgorithms;

class Challenge4 {
    public static void main(String[] args) {
        System.out.println(counting("00011101"));
//        0011000110
    }
    public static Integer counting( String s ) {
        int curr = 1, prev = 0, ans = 0;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i-1)) curr++;
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        return ans + Math.min(curr, prev);


//        String[] arr = s.split("");
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//
//            int count0 = 0;
//            int count1 = 0;
////            System.out.println("loop" + i);
//            for(int j = i; j < arr.length; j++ ){
//                if(arr[j].equals("0")){
//                    count0 = count0 + 1;
//                    System.out.println("count0 :" + count0);
//                }else if(arr[j].equals("1")){
//                    count1 = count1 + 1;
//                    System.out.println("count1 :" + count1);
//                }
//
//                if(count0 == count1){
//                    count = count + 1;
////                    System.out.println("check count "+count + " " + i);
//                }
//            }
//
//        }
//        return count;
    }
}

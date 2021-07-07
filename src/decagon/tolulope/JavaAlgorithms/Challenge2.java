package decagon.tolulope.JavaAlgorithms;

import java.util.Arrays;
import java.util.List;

class Challenge2 {
    public static void main(String[] args) {
        System.out.println(packArray(Arrays.asList(1,2,3,4,5,6,7,8)));
        System.out.println(packArray(Arrays.asList(0)));
        System.out.println(packArray(Arrays.asList(4)));
    }
    public static Integer packArray( List<Integer> arr ) {
        int sum = 0;
        StringBuffer sb = new StringBuffer();
        StringBuffer cb = new StringBuffer();
//            if(arr.toArray().length>1){
                for (int i =0; i < arr.toArray().length; i++){
//                System.out.println(arr.get(i));
                    try{
                        if((i%2==0)){
                            sb.append(arr.get(i)+arr.get(i+1)+" ");
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        sb.append(arr.get(i));
                    }
                }
                String[] newArr = sb.toString().split(" ");
                for(int i = 0; i < newArr.length; i++){
                    try {
                        if((i%2==0)){
                            cb.append(Integer.parseInt(newArr[i])*Integer.parseInt(newArr[i+1])+" ");
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        cb.append(Integer.parseInt(newArr[i]));
                    }
                }
                String[] lstArr = cb.toString().split(" ");
                try {

                    sum = Integer.parseInt(lstArr[0]) + Integer.parseInt(lstArr[1]);
                }catch (ArrayIndexOutOfBoundsException e){
                    sum = Integer.parseInt(lstArr[0]);
                }

//            }
//            if(arr.toArray().length==1){
//                sum = arr.get(0);
//            }
            return sum;



    }
}

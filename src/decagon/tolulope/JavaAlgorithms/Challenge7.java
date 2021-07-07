package decagon.tolulope.JavaAlgorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Challenge7 {
    public static void main(String[] args) {
        System.out.println(sortCsvColumns("Beth,Charles,Danielle,Adam,Eric\n17945,10091,10088,3907,10132\n2,12,13,48,11"));
    }
    public static String sortCsvColumns( String csv_data ) {
        String[] arr = csv_data.split("\n");
        int numOfArrays = 0;
        for(int ar = 0; ar < arr.length; ar++){
            numOfArrays++;
        }
        String[] finalArray = new String[numOfArrays * arr[0].split(",").length];
//        int
//        String[] row1 = arr[0].split(",");
//        String[] row2 = arr[1].split(",");
//        String[] row3 = arr[2].split(",");

        List<String> sortedrow1 = Arrays.stream(arr[0].split(",")).sorted().collect(Collectors.toList());
        for(int i = 0; i<sortedrow1.size(); i++){
            for(int noa = 0; noa<numOfArrays*arr[0].split(",").length; noa++){
                if(noa>0) {
                    noa = noa * arr[0].split(",").length;
                }
                System.out.println(noa);
                for(int j = 0; j<arr[0].split(",").length; j++){
                    if(sortedrow1.get(i).equals(arr[0].split(",")[j])){
                        finalArray[noa] = arr[noa].split(",")[j];
                    }
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int in = 0; in < finalArray.length; in++){
            if(in==4 || in == 9){
                sb.append(finalArray[in]+"\n");
            }else{
                sb.append(finalArray[in]+",");
            }
        }
        String ans = sb.toString();
        return ans.substring(0, ans.length()-1);
    }
}

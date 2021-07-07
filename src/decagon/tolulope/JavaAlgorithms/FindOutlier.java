package decagon.tolulope.JavaAlgorithms;

public class FindOutlier{
    static int find(int[] integers){
        int count = 0;
        for(int i = 0; i < integers.length; i++)
            if(integers[i]%2==0) count += 1;

        if(count > 1){

            for(int x: integers)
                if(x%2!=0)return x;
        }else{
            for(int x: integers)
                if(x%2==0)return x;
        }
        return 0;
    }
}

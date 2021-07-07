package decagon.tolulope.JavaAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        System.out.println(sjf(Arrays.asList(3,10,10,20,1,2),2));
    }
    public static Integer sjf(List<Integer> jobs, Integer index ) {
        int num = 0;
        for(Integer job: jobs){
            if(job <= jobs.get(index)){
                num += job;
            }
        }

        for(int i = index+1; i < jobs.size(); i++ ){
            if(jobs.get(index) == jobs.get(i)){
                num -= jobs.get(i);
            }
        }
        return num;
    }
}
package decagon.tolulope.JavaAlgorithms;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int[] eachList;
        int boarders = 0;
        int highlighters = 0;

        if(stops.size() > 0){
            for(int i = 0; i < stops.size(); i++){
                eachList = stops.get(i);
                boarders += eachList[0];
                highlighters += eachList[1];
            }
        }

        return boarders - highlighters;


    }
}

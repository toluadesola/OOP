package decagon.tolulope.LINKEDLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Rice");
        list.add("Beans");
        list.add("Yam");
        list.add("Eggs");
        list.add("Milk");
        list.add("Bread");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        while ((itr.))
    }
}

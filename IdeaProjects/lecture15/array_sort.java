package lecture15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_sort {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}

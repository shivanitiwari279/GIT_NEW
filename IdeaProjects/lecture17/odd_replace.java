package lecture17;

import java.util.ArrayList;
import java.util.ListIterator;

public class odd_replace {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> it = list.listIterator();

        while(it.hasNext()){
            int value = it.next();
            if(value %2 != 0){
                it.set(-1);
            }
        }
        System.out.println(list);
    }
}
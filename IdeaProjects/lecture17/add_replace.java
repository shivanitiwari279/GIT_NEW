package lecture17;

import java.util.ArrayList;
import java.util.ListIterator;

public class add_replace {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    ListIterator<Integer> iterator = list.listIterator();
        System.out.println("The list is:");
        while(iterator.hasNext())
        {
        int a = iterator.next();
        if (a==3){
            iterator.add(5);
        }
       }
        System.out.println(list);
   }
}

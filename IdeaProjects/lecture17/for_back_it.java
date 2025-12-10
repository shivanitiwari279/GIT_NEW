package lecture17;

import java.util.ArrayList;
import java.util.ListIterator;

public class for_back_it {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer> iterator= list.listIterator();
        System.out.println("Forward list is:");

        while (iterator.hasNext()){
            int a= iterator.next();
            System.out.println(a);
        }
        System.out.println("Backward list is:");

        while (iterator.hasPrevious()){
            int x= iterator.previous();
            System.out.println(x);
        }
    }
}

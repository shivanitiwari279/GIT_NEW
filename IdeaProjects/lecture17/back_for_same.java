package lecture17;

import java.util.ArrayList;
import java.util.ListIterator;

public class back_for_same {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int A=list.size();
        int B=A/2;
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext() && it.nextIndex()<=B) {
              int x=it.next();
            System.out.println(x);
            }
        while (it.hasPrevious()){
            int y=it.previous();
            System.out.println(y);
        }
        }
    }


package lecture17;

import java.util.ArrayList;
import java.util.ListIterator;

public class replace_absolute {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(2);
        list.add(-3);
        list.add(4);
        list.add(-5);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x <= 0)
                it.set(x*-1);
        }
        System.out.println(list);
    }
}
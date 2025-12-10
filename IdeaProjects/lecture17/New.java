package lecture17;

import java.util.ArrayList;
import java.util.ListIterator;

public class New {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(16);

        int target = 14;
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x == target)
                break;
        }
        while (it.hasPrevious()) {
            int y = it.previous();
            if (y < target) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
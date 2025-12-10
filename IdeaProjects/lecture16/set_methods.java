package lecture16;

import java.util.HashSet;

public class set_methods {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(x)) {
                System.out.println("true");
            }
            set.add(x);
        }
        System.out.println("false");
//       set.add(10);
//       set.add(10);
//       set.add(20);
//       set.add(30);
//      System.out.println(set);
        }
    }

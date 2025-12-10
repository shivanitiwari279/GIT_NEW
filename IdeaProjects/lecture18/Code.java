package lecture18;

import java.util.ArrayList;
import java.util.ListIterator;


// QUESTION : PRINT [10,20,3]
public class Code {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(40);
         list.add(5);
         list.add(3);
         list.add(10);
         list.add(20);
         list.add(3);
         int A=list.size();
         int B=A/2;
         ListIterator<Integer> it = list.listIterator();
         System.out.println();
    }
}

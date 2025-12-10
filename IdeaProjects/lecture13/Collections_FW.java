package lecture13;

// COLLECTION FRAME WORK//

import java.util.ArrayList;
//import java.util.*; ( By using "*" after util we can access any library and it won't take more time and this "*" is known
// as UNIVERSAL SELECTOR)

public class Collections_FW {
     public static void main(String[] args) {

         // OPERATIONS IN ARRAY

         ArrayList<Integer> list = new ArrayList<>();
         // ADDING EXTRA ELEMENT
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(0, 1);
         System.out.println("List : "+list);
         ArrayList<Integer> list1 = new ArrayList<>();
         list1.add(5);
         list1.add(6);
         list1.add(7);
         list1.add(8);
         System.out.println("List1 : "+list1);
         list.addAll(list1);    // ADDITION OR COMBINATION OF TWO LIST
         System.out.println("Combine list: " + list);
         System.out.println("New list after operation ");

         //ACCESS ELEMENT
//         int first=list.get(0);
//        System.out.println("First element of list: " +first);
//         int last=list.get(list.size()-1);
//        System.out.println("Last element of list: " +last);

         //UPDATE/MODIFY ELEMENT
//        list.set(2,10);
//        System.out.println("Update list: "+list);

         //REMOVE OPERATION
//      list.remove(4);
//      System.out.println("After removing : "+list);
//      list.remove(Integer.valueOf(15));
//      System.out.println("After removing : "+list);
//      list.clear();
//      System.out.println("Current list : "+list);

         //SEARCH OPERATION
//         boolean exists= list.contains(20);
//         System.out.println(exists);
//         int index1= list.indexOf(7);
//         System.out.println(index1);
//           int index2= list.lastIndexOf(12);
//           System.out.println(index2);

         //SIZE & EMPTY
//         int size= list.size();
//         System.out.println(size);
//         boolean isEmpty = list.isEmpty();
//         System.out.println(isEmpty);

         // LOOP/ITERATE
//         a. Normal loop
//         for (int i=0;i<list.size();i++){
//             System.out.println(list.get(i));
//         }

//         b.Enhance for loop
//         for (int num : list){
//             System.out.println(num);
//         }



     }
}

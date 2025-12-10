package lecture13;

import java.util.LinkedList;

public class Operationsin_LL {
    public static void main(String[] args ){
        LinkedList<Integer>list=new LinkedList<>();
        list.addFirst(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.addLast(35);
        System.out.println("list: "+list);

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


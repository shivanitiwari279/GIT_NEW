package lecture14;

import java.util.HashMap;

public class arr_target_sum {
    public static void main(String[] args){
        int arr[]={2,4,5,7};
        HashMap<Integer,Integer> map=new HashMap<>();
        int target=9;
        for (int i=0;i<arr.length;i++){
            int diff=arr[i]-target;
            map.put(diff,diff);
            System.out.println("");
        }
    }
}

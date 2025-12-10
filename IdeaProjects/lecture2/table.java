package lecture2;

import java.util.Scanner;
public class table {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int table;
       System.out.println("THE TABLE OS 5 IS AS FOLLOWING:");
       for (int i=1;i<=10;i++){
           table=n*i;
           System.out.println(table);
       }
    }
}

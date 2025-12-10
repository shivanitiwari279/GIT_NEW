package PRACTICE;

import java.util.Scanner;
public class prac4 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int table;
            for(int i=1;i<=10;i++){
                table=n*i;
                System.out.println(n+" "+"x"+" "+i+" "+"="+" "+table);
            }
        }
}

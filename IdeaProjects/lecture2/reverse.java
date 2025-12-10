package lecture2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS :");
        int n=sc.nextInt();
        int reversed=0;
        while (n!=0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        System.out.println("REVERSED NUMBERS:");
       System.out.println(reversed);
    }
}


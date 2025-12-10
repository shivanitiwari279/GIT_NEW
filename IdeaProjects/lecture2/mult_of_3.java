package lecture2;

import java.util.Scanner;
public class mult_of_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if (n%3==0){
            System.out.println("The num is multiple of 3!");
        }
        else {
            System.out.println("The num is not multiple of 3!");
        }
    }
}

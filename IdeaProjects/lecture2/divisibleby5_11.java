package lecture2;

import java.util.Scanner;
public class divisibleby5_11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%5==0 && n%11==0){
            System.out.println("The num is divisible by 5 and 11 both!");
        }
        else {
            System.out.println("The num is not divisible by  5 and 11!");
        }
    }
}

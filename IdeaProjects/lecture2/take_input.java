package lecture2;

import java.util.Scanner;

public class take_input {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int num :");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter the float num :");
        float b = sc.nextFloat();
        System.out.println(b);
        System.out.println("Enter the string:");
        String str = sc.next();
        System.out.println(str);
    }
}

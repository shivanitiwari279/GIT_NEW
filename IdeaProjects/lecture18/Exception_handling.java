package lecture18;

import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
//            int a = 5;
//            int b = 0;
//            int c = a / b;
//            System.out.println(c);   //Error will occur therefor remaining code below it will not run
//             int arr[]={1,2,3};
//            System.out.println(arr[5]);
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int m=sc.nextInt();
//            int a=n/m;
            String str=null;
            System.out.println(str.length());
        }
        catch (Exception e){         // TRY-CATCH  is used for preventing whole code with error  which occur due to error in any of one code
            System.out.println(e);   // Here "e" is name of variable ,inside of it we get the type or error that occur in code
        }
        finally {                    // There is possibility that try and catch will not run but finally will always  run
            System.out.println("hummpy");
        }
        System.out.println("byee");
    }
}

// try catch can not run spontaneously because if try is incorrect catch will not work

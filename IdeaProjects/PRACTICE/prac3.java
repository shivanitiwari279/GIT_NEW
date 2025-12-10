package PRACTICE;

import java.util.Scanner;

public class prac3 {
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else {
            return  n+sum(n-1);
        }
    }

    public static void main(String[] args){

    }
}

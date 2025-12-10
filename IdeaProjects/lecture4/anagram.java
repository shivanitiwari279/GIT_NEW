package lecture4;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str = "eye";
        String str1 = "yee";

        char ch[]= str.toCharArray();
        char ch1[]= str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String s1 = new String(ch);
        String s2 = new String(ch1);
        if(s1.equals(s2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        }
    }

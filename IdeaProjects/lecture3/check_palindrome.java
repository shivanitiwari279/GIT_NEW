package lecture3;

public class check_palindrome {
    public static void main(String[] args){
        String str="abcba";
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i); // recreated the string not changing!
        }
        if (str1.equals(str)){
            System.out.println("true!");
        }
        else {
            System.out.println("false!");
        }
    }
}

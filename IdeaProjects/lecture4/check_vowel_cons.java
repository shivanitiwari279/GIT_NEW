package lecture4;

public class check_vowel_cons {
    public static void main(String[] args){
        String str="objective";
        int v=0;
        int c=0;
        for(char ch:str.toCharArray()){
            if ("aeiou".indexOf(ch)!=-1){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("No of vowel are:"+v);
        System.out.println("No of constent are:"+c);

    }
}

package lecture4;

public class largest_char {
    public static void main(String[] args){
        String str="Java is powerfull";
        String max ="";
        int m=0;
        String a[]=str.split(" ");

        for(String s:a){
            if(s.length()>m ){
                m=s.length();
                max=s;
            }

        }
        System.out.println("Largest string is:"+max);

    }
}

package lecture4;

public class frequency {
    public static void main(String[] args){
        String str="Java is powerfull";
        int freq[]=new int[256];


        for(char c:str.toCharArray()) {
            freq[c]++;
        }
           for (int i=0;i<256;i++){
               if(freq[i]>0){
                   System.out.println((char)i + ":" + freq[i]);
               }

           }
        }

    }


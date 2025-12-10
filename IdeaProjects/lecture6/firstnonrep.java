package lecture6;

public class firstnonrep {
    void Non_Repeat(){
        System.out.println("First Non repeating element is: ");
    }
    public static void main(String[] args) {
        String str = "aabbcd";
        int freq[] = new int[256];
        firstnonrep obj = new firstnonrep();
        obj.Non_Repeat();
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] == 1) {
                System.out.println((char) i);
                break;
            }

        }
    }
}

package lecture2;

public class vowel_cons {
    public static void main(String[] arg) {
        char ch = 'k';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowel");
                break;
            default:

                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println("contant");
                } else {
                    System.out.println("not an alphabet character");
                }

        }
    }
}
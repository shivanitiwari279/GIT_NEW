package lecture19;

import java.io.*;
public class Creating {
    public static void main(String[] args) {
//        createNewFile();
//        createData();
        try {
            File file = new File("index.html");
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exits");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

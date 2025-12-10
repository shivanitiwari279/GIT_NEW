package lecture19;

import java.io.*;

public class Deletion {
    public static void main(String[] args) {
          deleteFile();
    }
    static void deleteFile() {
        try {
            File file = new File("index.html");
            if(file.delete()) {
                System.out.println("File is deleted");
            } else {
            }
        } catch (Exception e) {
        }
        }

}
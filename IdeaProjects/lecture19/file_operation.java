package lecture19;

import java.io.*;

 public class file_operation {
    public static void main(String[] args) {
          readData();
//        createNewFile();
//        createData();

    }
//    static void createNewFile(){
//        try{
//            FileWriter writer=new FileWriter("hello.htlm");
//            writer.write("Here! new file is created");
//            writer.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//     static void createData(){
//         try{
//             FileWriter writer=new FileWriter("run.htlm");
//             writer.write("Here! file is created");
//             writer.close();
//         }catch (Exception e){
//             System.out.println(e);
//         }
//     }
     static void readData(){
          try{
              FileReader reader=new FileReader("hello.html");
              int ch;
              while ((ch=reader.read())!=-1){
                  System.out.print((char)ch);
              }
          } catch (Exception e) {
              System.out.println(e);
          }
     }

}

package lecture8;


class Employee{
    void work(){
        System.out.println("I am working...");
    }
}
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("I am attending meeting...");
    }
}
public class SL_IH2 {
    public static void main(String[] args){
        Manager M=new Manager();
        M.work();
        M.attendMeeting();
    }
}

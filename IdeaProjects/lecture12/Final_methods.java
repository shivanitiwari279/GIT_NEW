package lecture12;


class College {
    final void call(){
        System.out.println("Student is not having fun in java class");
    }
}
class Student extends College{

}
public class Final_methods {
    public static void main(String[] args){
        Student S=new Student();
        S.call();
    }

}

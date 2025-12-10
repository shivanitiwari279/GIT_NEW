package lecture8;


class Person{
    void displayName(){
        System.out.println("The name is Roy Raze");
    }
}
class Student1 extends Person{
    void displayClass(){
        System.out.println("The Student is in 11th class..");
    }
}
class Monitor extends Student1{
    void checkDiscipline(){
        System.out.println("Monitor's duty is to check discipline ");
    }
}
public class ML_IH2 {
    public static void main(String[] args){
       Monitor m=new Monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
    }
}

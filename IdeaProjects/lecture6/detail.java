package lecture6;

public class detail {
    public static void main(String[] args){
        Student obj=new Student();
        obj.display();
    }
}

class Student{
    String name="ROY";
    int roll_no=1234;
    int marks=92;
    void display(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(marks);
    }
}

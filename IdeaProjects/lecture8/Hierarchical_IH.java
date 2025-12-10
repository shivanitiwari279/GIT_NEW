package lecture8;

class College{
    void moto(){
        System.out.println("Global The BEST!");
    }
}
class Teacher extends College{
    void teach(){
        System.out.println("Teacher is teaching!");
    }
}

class Student extends College{
    void Study(){
        System.out.println("Student is studying in the College!");
    }
}



public class Hierarchical_IH {
    public static void main(String[] args){
        Student S=new Student();
        S.moto();
        S.Study();
        Teacher T=new Teacher();
        T.moto();
        T.teach();
    }

}

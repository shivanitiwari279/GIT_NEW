package lecture15;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int RollNo;
    public Student(int RollNo, String name){
        this.RollNo=RollNo;
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class NameSorted implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
public class sort_string {
    public static void main( String[] args){
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(1,"Roy"));
        list.add(new Student(10,"Siya"));
        Collections.sort(list,new NameSorted());
        for (Student s:list){
            System.out.println(s.RollNo+" "+s.name);
        }
    }
}

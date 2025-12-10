package lecture6;

public class Class {
    public static void main(String[] args){
        Car obj=new Car();
        obj.display();
    }
}

class Car{
    String name="BMW";
    void display(){
        System.out.println(name);
    }
}
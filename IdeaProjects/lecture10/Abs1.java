package lecture10;


//1. Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
//'Circle' and 'Rectangle'.

abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    void area(){
        System.out.println("Area of circle is : 3.14*r*r");
    }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Area of rectangle is : l*b");
    }
}
public class Abs1 {
    public static void main(String[] args){
        Circle c1= new Circle();
        c1.area();
        Rectangle r1=new Rectangle();
        r1.area();
    }
}


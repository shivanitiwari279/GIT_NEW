package lecture8;

class Shape{
    void draw(){
        System.out.println("The shape of circle is round...");
    }
}
class Circle extends Shape{
    void calculateArea(){
        System.out.println("The area of circle is 3.14*r^2..");
    }
}
public class SL_IH3 {
    public static void main(String[] args){
        Circle C=new Circle();
        C.draw();
        C.calculateArea();
    }
}

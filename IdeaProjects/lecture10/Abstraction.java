package lecture10;


abstract class Fruit{
    abstract void taste(); //FOR HIDING THE INFORMATION , WE USE ABSTRACTIONS
    void eat(){
        System.out.println("Fruit is eaten");
    }
}
class Apple extends Fruit{
    void taste(){
        System.out.println("Apple is tasted");
    }
}
public class Abstraction {
    public static void main(String[] args){
//        Apple A=new Apple();
//        A.taste();
//        A.eat();
        Fruit F= new Apple();
        F.eat();
        F.taste();
    }
}

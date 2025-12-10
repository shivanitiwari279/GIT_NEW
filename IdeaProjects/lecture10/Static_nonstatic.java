package lecture10;

class Parent{
    static void staticmethod2(){
        System.out.println("helloo");
    }
    void instancemethod3(){
        System.out.println("hiii");
    }
}
class Child extends Parent{
    static void staticmethod2(){
        System.out.println("hoiii");
    }
    void instancemethod3(){
        System.out.println("hehe");
    }
}
public class Static_nonstatic {
    public static void main(String[] args){
        Parent P=new Child();
        P.staticmethod2();
        P.instancemethod3();

    }
}

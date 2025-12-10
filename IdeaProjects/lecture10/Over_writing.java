package lecture10;


class Animal{
    void eat(){
        System.out.println("eating !");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating and drinking!");
    }
    void walk(){
        System.out.println("walking!");
    }
}
public class Over_writing {
    public static void main(String[] args){
        Animal D1=new Dog();
//        D1.eat();
//        D1.walk();

//        UPPER CASTING -> taking reference of parent class but accessing  the property of child class
//        As in upper casting the only property can be accessed which is common int both class

//        Animal A1=new Dog();
//        A1.eat();

//        LOWER CASTING -> taking reference of parent class but can also access the property of child class

          Dog D2=(Dog) D1;
          D2.walk();
          D2.eat();
    }
}

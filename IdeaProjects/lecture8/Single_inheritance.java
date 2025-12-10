package lecture8;

class Animal{
    void eat(){
        System.out.println("Animal is eating!");
    }
}
 class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking!");
    }
 }

public class Single_inheritance {
        public static void main(String[] args){
            Dog D=new Dog();
            D.eat();
            D.bark();
        }
}
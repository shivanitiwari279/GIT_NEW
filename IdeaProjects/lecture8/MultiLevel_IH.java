package lecture8;

class ANIMAL{
    void eat(){
        System.out.println("Animal is eating!");
    }
}
class DOG extends ANIMAL{
    void bark(){
        System.out.println("Dog is barking!");
    }
}

class PUPPY extends DOG{
    void walk(){
        System.out.println("Puppy is walking!");
    }
}
public class MultiLevel_IH {
    public static void main(String[] args){
        PUPPY P=new PUPPY();
        P.eat();
        P.bark();
        P.walk();
    }
}

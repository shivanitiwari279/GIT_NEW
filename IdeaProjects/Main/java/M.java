package Main.java;

import lecture11.A;
import lecture11.B;


class  C1 {
    public static void show1() {
        int a = 4;
        System.out.println("Hence a:"+a);
    }
}
class  C2 {
    private static void call() {
        int x = 6;
        System.out.println("Hence x=:"+x);
    }
}
class  C3 {
    protected static void recall() {
        int y = 8;
        System.out.println("Hence y=:"+y);
    }
}

public class M {
    public static void main(String[] args){
//      A s1=new A();
//      s1.show();
//      B s2=new B();
//      s2.intro();
        C1 C=new C1();
        C.show1();
//      C2 c=new C2();
//      c.call();
        C3 c1=new C3();
        c1.recall();
    }

}

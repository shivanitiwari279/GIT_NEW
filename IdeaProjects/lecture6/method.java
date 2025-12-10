package lecture6;

public class method {
    public static void main(String[] args){
        Rectangle obj=new Rectangle();
        obj.display();
    }
}
 class Rectangle{
    int l=6;
    int b=5;
    void display(){
        System.out.println("Area is:"+l*b);
        System.out.println("Perimeter is:"+2*(l+b));
    }
 }
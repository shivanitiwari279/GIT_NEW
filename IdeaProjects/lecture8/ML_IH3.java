package lecture8;

class Device {
    void powerOn(){
        System.out.println("The is On now");
    }
}
class Laptop extends Device {
    void method_boot(){
        System.out.println("The laptop is working well ");
    }
}
class GamingLaptop extends Laptop{
    void start_game(){
        System.out.println("This laptop is best for gaming");
    }
}
public class ML_IH3 {
    public static void main(String[] args){
       GamingLaptop G=new GamingLaptop();
       G.powerOn();
       G.start_game();
       G.method_boot();
    }
}

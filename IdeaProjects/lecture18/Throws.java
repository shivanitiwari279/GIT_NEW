package lecture18;

public class Throws {
    public static void main(String[] args) {
        try{
            riskmethod();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Program continue..");
    }
    static void riskmethod() throws ArithmeticException{
        System.out.println("Risky method occur");
        int result=10/0;
        System.out.println("RESULT :"+result);
        System.out.println("Risky method end");
    }
}

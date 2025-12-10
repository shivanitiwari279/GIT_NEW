package lecture18;


// Through is used when we manually create any problem by our own
public class Throw {
    public static void main(String[] args) {
         try{
             vote_age(15);
         }
         catch (Exception e){
             System.out.println(e);
         }
         try{
             vote_age(19);
         } catch (Exception e) {
         }
    }
    static void vote_age(int age){
        System.out.println("Checking Eligibility ");
        if (age<18){
            throw new IllegalArgumentException("not Eligible");
        }
    }
}



// WE CAN USE MULTIPLE TRY CATCH IN A CODE BUT NOT A MORE TRY IN A TRY
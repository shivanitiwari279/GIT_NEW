package lecture6;

public class BA {
    public static void main(String[] args){
        BankAccount obj=new BankAccount();
        obj.display();
        obj.deposit(200);
        obj.withdraw(200);
    }
}

class BankAccount{
    int accountNumber=1234;
    String accountHolder="Sanvi";
    float balance=22200;
    int m=200;
    void display(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Accountholder is:"+accountHolder);
        System.out.println("balance is:"+ balance);
    }
    void deposit(int m){
        balance=balance+m;
        System.out.println(" Current Balance is:"+balance);
    }
    void withdraw(int m){
        balance=balance-m;
        System.out.println(" Current Balance is:"+balance);
    }
}
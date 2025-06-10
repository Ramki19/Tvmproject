import java.util.*;
abstract class Account{
    private int accountno;
    private String holdername;
    int balance;

    public Account(int accountno, String holdername, int balance){
        this.accountno=accountno;
        this.holdername=holdername;
        this.balance=balance;
        System.out.println("hello");
    }
    abstract void deposit(int amount);
    abstract void withdrawl(int amount);
    public void display(){
        System.out.println("Account no: " +accountno +"A/c holder name :" +holdername +"current balance " +balance );
    }
}
class Details extends Account{
    public Details(int accountno, String holdername, int balance){
        super(accountno,holdername, balance);
    }
    public void deposit(int amount){
        if(amount >0){
            balance=balance+amount;
        }
        else{
            System.out.println("amount succesffuly deposited");
        }
            }
            public void withdrawl(int amount){
                if(amount < balance){
                    balance=balance-amount;
                }
                else{
                    System.out.println("Insufficient balance");
                }


            }
}

public class Bankaccount {
public static void main(String[] args){
    Details obj=new Details(1231223,"ramakrishnan",5000);
    Scanner sc=new Scanner(System.in);
    System.out.println("enter you choice 1 for withdrawl, 2 for deposit");
    int choice=sc.nextInt();

    if(choice==1){
        System.out.println("enter the deposit amount");
        obj.deposit(sc.nextInt());

    }
    else if(choice==2){
        System.out.println("enter the withdrawl amount");
        obj.withdrawl(sc.nextInt());

    }
    else{
        sc.close();
        return;
    }
    obj.display();
}

}

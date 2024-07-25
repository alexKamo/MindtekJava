package TESTS;

public class BankAccount implements Runnable{


    int balance = 0;
    int amount;

    public BankAccount(int amount){
        this.amount=amount;
    }

    public void deposit(){
        balance+=amount;
    }

    public void run() {
        deposit();
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(100);


        Thread thread1 = new Thread(account1);




    }



}

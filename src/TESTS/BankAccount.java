package TESTS;

public class BankAccount {


    int balance = 0;
    public void deposit(int amount){
        balance+=amount;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        DepositTask task = new DepositTask(account1,100);

        Thread thread1 = new Thread(account1);




    }



}

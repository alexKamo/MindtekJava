package ExceptionPractice2;

public class BankAccount {

    /*
    .deposit(100);
    .makeTransaction(250);
     */

    int balance;

    public void deposit(int amount){
        balance+=amount;
    }

    public void makeTransaction(int amount) throws InsufficientFundsException{
        if (balance>=amount){
            balance-=amount;
        }else {
            throw new InsufficientFundsException("Not enough balance to make a transaction");
        }
    }
}

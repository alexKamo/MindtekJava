package ExceptionPractice2;

public class CheckingAccount  extends BankAccount{

    @Override
    public void makeTransaction(int amount) throws InsufficientFundsException{
        if (amount<20000){
            if (balance>=amount){
                balance-=amount;
            }else {
                throw new InsufficientFundsException("Checking account doesn't have enough balance for make a transaction");
            }
        }else {
            throw new BigAmountTransactionException("Your account is locked. Please call the bank");
        }
    }

}

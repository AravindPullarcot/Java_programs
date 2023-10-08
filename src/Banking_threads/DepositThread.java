package Banking_threads;

public class DepositThread implements Runnable{
    int amount;
    Account account;
    public DepositThread(int amount,Account account){
        this.account=account;
        this.amount=amount;
    }
    public void run(){
        account.deposit(amount);

    }
}

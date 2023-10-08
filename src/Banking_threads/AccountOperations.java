package Banking_threads;

public class AccountOperations implements Runnable{
    private Account account;
    public AccountOperations(Account account){
        this.account=account;
    }
    public void run(){
        account.deposit(200);
        account.withdrawal(300);


    }
}

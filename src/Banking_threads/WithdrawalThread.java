package Banking_threads;

//import Multithread_banking.Withdrawal;

public class WithdrawalThread implements Runnable {
    Account account;
    int withdrawal;
    public WithdrawalThread(int withdrawal,Account account){
        this.account=account;
        this.withdrawal=withdrawal;
    }
    public void run(){

        while (withdrawal<=account.balance)
        try{
            account.withdrawal(withdrawal);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Insufficient balance in bank account");
    }
}

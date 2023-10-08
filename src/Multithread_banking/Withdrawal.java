//package Multithread_banking;
//
//public class Withdrawal implements Runnable{
//    int withdrawal;
//    createAccount account;
//    deposit depo;
//
//    public Withdrawal(createAccount account) {
//        this.account=account;
//    }
//
//    synchronized public void setWithdrawal(int withdrawal){
//        if (withdrawal>depo.getdeposit()){
//            try{
//                wait();
//                //Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        int newbalance=depo.getdeposit()-withdrawal;
//        System.out.println("Amount of "+withdrawal+"is taken from the account\nThe new balance is"+newbalance);
//        notify();
//    }
//
//
//    @Override
//    public void run() {
//
//    }
//}

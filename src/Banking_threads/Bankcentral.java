package Banking_threads;

import java.util.Arrays;
import java.util.Scanner;

public class Bankcentral  {
    public static void main(String[] args){
        Account []accounts=new Account[6];
        Scanner scanner=new Scanner(System.in);
        accounts[0]=new Account("Arun",21,345);
        accounts[1]=new Account("Manu",28,678);
        accounts[2]=new Account("Anand",27,276);
        accounts[3]=new Account("Kiran",25,876);
        accounts[4]=new Account("Varun",24,457);

        Thread[] threads=new Thread[6];
        for(int i=0;i< accounts.length;i++){
            threads[i]=new Thread(new AccountOperations(accounts[i]));
            threads[i].start();
        }
        for (int i=0;i<accounts.length;i++){
            Thread thread=threads[i];
            try{
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//
//        for(int i=0;i<6;i++){
//            System.out.println("Enter your account details for "+i+"th Account\n Name\n Age \n Balance\n");
//            String name= scanner.nextLine();
//            int age= Integer.parseInt(scanner.nextLine());
//            int balance= Integer.parseInt(scanner.nextLine());
//            accounts[i]=new Account(name,age,balance);
//
//
//        }
//        for(int i=0;i<accounts.length;i++){
//            Thread thread1=new Thread(accounts[0]);
//            Thread thread2=new Thread(String.valueOf(accounts[i]));
//            thread1.start();
//            thread2.start();
//
//        }

        //Thread DepositThread1=
//        for(int i=1;i<=6;i++) {
//            Thread DepositThread1 = new Thread(new DepositThread(344, account));
//            Thread WithdrawalThread1 = new Thread(new WithdrawalThread(200, account));
//            DepositThread1.start();
//            WithdrawalThread1.start();
//            try {
//                DepositThread1.join();
//            } catch (InterruptedException e) {
//                e.getMessage();
//            }
//        }

    }
}
//thread functions-start,run,wait,sleep,notify,notifyall,setpriority,getpriority,getname,setname,join,suspend,resume,settimer,
//Account class -withdrawal,deposit,showbalance ,3 functions
//customer class-thread, this will use account data structure- will have the threads
//main class having threads for customer
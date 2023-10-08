package Banking_threads;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Account {
    int balance;
    Scanner scanner=new Scanner(System.in);
    String name;
    int age;
    int firstDeposit;
    String typeAccount;
    Random random=new Random();
    LongStream accountNumber=random.longs(9999,100000);

//    public void setvalues(String name,int age,int firstDeposit){
//        this.name=name;
//        this.age=age;
//        this.firstDeposit=firstDeposit;
//        typeAccount="Savings";
//        System.out.println("The account details are\nAccountName: " + name + "\nType of account: " + typeAccount + "\nAccountNumber: " + accountNumber + "\nAccountBalance: " + firstDeposit);
//
//    }



//    public Account(){
//
//        System.out.println("Enter your account details \n Name\n Age \n Balance");
//        this.name= scanner.nextLine();
//        this.age= Integer.parseInt(scanner.nextLine());
//        typeAccount="Savings";
//        System.out.println("The account details are\nAccountName: " + name + "\nType of account: " + typeAccount + "\nAccountNumber: " + accountNumber + "\nAccountBalance: " + firstDeposit);
//        this.balance= Integer.parseInt(scanner.nextLine());
//    }
    public Account(String name,int age,int balance){

        this.name=name;
        this.age= age;
        typeAccount="Savings";
        this.balance= balance;
        System.out.println("The account details are\nAccountName: " + name + "\nType of account: " + typeAccount + "\nAccountNumber: " + accountNumber + "\nAccountBalance: " + balance);

    }
    synchronized public void deposit(int amount){
        balance=amount+balance;
        System.out.println("Deposit of "+amount+" for "+name+" is done, :The updated balance is"+balance);
        notify();
    }
   synchronized public void withdrawal(int amount){
        while(balance<amount){
            System.out.println("Insufficient balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        balance=balance-amount;
        System.out.println("Withdrawal of "+amount+" for"+name+" is done,:The new balance is"+balance);

    }
    public int showBalance(){
        return balance;
    }
//    public int getBalance()
//    {
//        return balance;
//    }
}


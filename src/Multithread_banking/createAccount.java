package Multithread_banking;

import java.util.Random;
import java.util.stream.LongStream;

public class createAccount {
    String name;
    int age;
    int firstDeposit;
    String typeAccount;
    Random random=new Random();
    LongStream accountNumber=random.longs(9999,100000);

    public createAccount(String name,int age,int firstDeposit){
        this.name=name;
        this.age=age;
        this.firstDeposit=firstDeposit;
        typeAccount="Savings";
        System.out.println("The account details are\nAccountName: " + name + "\nType of account: " + typeAccount + "\nAccountNumber: " + accountNumber + "\nAccountBalance: " + firstDeposit);

    }
    public int returnfirstDeposit(){
        return firstDeposit;
    }
}

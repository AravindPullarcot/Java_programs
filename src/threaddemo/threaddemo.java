package threaddemo;

import java.util.Date;
import java.lang.ThreadGroup;

public class threaddemo implements Runnable {//only if the class contains a void run method the class should have an implements runnable
    Date date;
    public threaddemo(){
        super();//super keyword initializes the constructors of the parents class
    }
    public void run(){
        while(true){
            date=new Date();
            System.out.print(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()+"\r");//to show time
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.getMessage();
            }
        }
    }
    public static void main(String[] args){
        threaddemo obj=new threaddemo();
        Thread tr=new Thread(obj);// new syntaxes for implements class
       // tr.start();// start function is common thread function to start a thread function
        ThreadGroup threadgroup=new ThreadGroup("ThreadGroup");
        Thread t1 = new Thread(threadgroup,new threaddemo(),"thread1");

        threadsparallel thread1=new threadsparallel(10000);
        threadsparallel thread2=new threadsparallel(4000);
        threadsparallel thread3=new threadsparallel(5000);
        Thread threads_1=new Thread(thread1);
        Thread threads_2=new Thread(thread2);
        Thread threads_3=new Thread(thread3);
//        threads_1.setPriority(Thread.MAX_PRIORITY);
//        threads_2.setPriority(Thread.NORM_PRIORITY);
//        threads_3.setPriority(Thread.MIN_PRIORITY);
        threads_1.start();
        threads_2.start();
        threads_3.start();
    }
}
//thread,runnable
//new state,runnable state,running state,waiting state,dead state
//The implements Runnable is used to indicate that a class is implementing the Runnable interface in Java. Implementing the Runnable interface means that the class defines a run() method, which is the entry point for the code that will be executed by a separate thread when the class is used to create a new thread.
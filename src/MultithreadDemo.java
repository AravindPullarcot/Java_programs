import static java.lang.Thread.*;//Program to show that if one thread fails the other threads will still keep running

public class MultithreadDemo implements Runnable{


    int threadnum;

    public MultithreadDemo(int threadnum){
        this.threadnum=threadnum;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println(i+ "Thread number is "+threadnum+" "+Thread.currentThread());
            if(threadnum==4 || threadnum==3){
                throw new RuntimeException("BLOW UP THIS Number "+threadnum+" THREAD");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args){

        for (int i=0;i<5;i++) {
            MultithreadDemo multithreadDemo=new MultithreadDemo(i);
            Thread thread1 = new Thread(multithreadDemo);
            Thread thread2 = new Thread(multithreadDemo);
            thread1.start();
            thread2.start();
        }
    }
}

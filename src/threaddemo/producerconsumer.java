package threaddemo;

public class producerconsumer {
    public static void main(String[] args){
        Queue obj=new Queue();//an instance of the shared buffer
        Thread producethread=new Thread(new producer(obj));
        Thread consumerthread=new Thread(new consumer(obj));
        producethread.start();
        consumerthread.start();
}
}


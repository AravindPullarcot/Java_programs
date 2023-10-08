package threaddemo;

public class producer implements Runnable{
    Queue obj;
    public producer(Queue obj){
        super();
        this.obj=obj;
    }
    public void run(){
        for(int i=1;i<50;i++){
            obj.put(i);
        }
    }
}

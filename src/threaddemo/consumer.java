package threaddemo;

public class consumer implements Runnable{
    Queue obj;
    public consumer(Queue obj){
        this.obj=obj;
    }
    public void run(){
        for(int i=1;i<57;i++){
            obj.consume();
        }
    }
}

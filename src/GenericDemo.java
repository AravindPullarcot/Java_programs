public class  GenericDemo <T, X> {// we are creating our own data structure to be used in any program

    T obj;
    X obj2;
    public void add(T obj, X obj2){
        this.obj=obj;
        this.obj2=obj2;
    }
    public T get(){
        return this.obj;
    }

}

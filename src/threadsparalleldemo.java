public class threadsparalleldemo extends Thread{

        public threadsparalleldemo(){
            super();
            System.out.println("Thread1 is running");

        }

    @Override
    public void run() {
        while(true){
            System.out.println(getName()+" is running");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
}

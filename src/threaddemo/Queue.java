package threaddemo;
    public class Queue {
        int count;
        boolean stock;

        synchronized public void put(int count) {//synchronized keyword is used to ensure that only one thread executes at ny given time


            while (stock) {
                try {
                    wait();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            this.count = count;
            stock = true;
            System.out.println("Produced "+count+" item");
            notify();// to wake up any waiting consumer threads
        }

        synchronized void consume() {
            while (!stock) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            System.out.println("consumed "+count+" items");
            stock = false;
            notify();
        }

    }


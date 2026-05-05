package threads.creatingThreads;

public class Warehouse {
    private int bags=0;
    public synchronized void produce()throws InterruptedException{
        bags++;
        System.out.println("Produced 1 Bag .Total:"+bags);
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        while(bags==0){
            System.out.println("Ware house Empty.Consumer Waiting....");
            wait();
        }
        bags--;
        System.out.println("Consumed 1 bag.Total:"+bags);
    }

}
s
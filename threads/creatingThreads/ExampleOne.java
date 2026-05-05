package threads.creatingThreads;

public class ExampleOne {


   
    public static void main(String[] args){
        MillTask t1=new MillTask();
        t1.start();
        MillTask t12=new MillTask();
        t12.start();
        Thread t2=new Thread(new QuotaImplemnatation());
        t2.start();

        Thread newThread= new Thread(()->{
               try {
                for(int i=0;i<50;i++){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("New thread running in parallel"+Thread.currentThread().getName());
                }
                } catch (InterruptedException e) {
                    e.printStackTrace(); 
                }
        });
        newThread.start();
    }

}
 class MillTask extends Thread{
        public void run(){
            System.out.println("Thread is running"+Thread.currentThread().getName());
        }
    }

 class QuotaImplemnatation implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
 }   

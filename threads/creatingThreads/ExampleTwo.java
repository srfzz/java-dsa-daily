package threads.creatingThreads;

public class ExampleTwo {

    public static void main(String[] args)throws InterruptedException{
     Thread worker =new Thread(()->{
    
        System.out.println("Processing Mill data");
        try {
            Thread.sleep(2000);
            
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("Mill Data Procesed");
    });
worker.setName("Mill Quota calcualtion");
    worker.start();
    worker.join();
    System.out.println("Main Thread all Work done Complete");

   }
    

}

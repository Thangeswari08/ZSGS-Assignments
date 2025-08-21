class MyThread extends Thread{
    public void run (){
        for(int i= 1; i <= 5; i++){
            System.out.println("Thread Name :" + Thread.currentThread().getName() + "- Message" + i );

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted !! :" + e.getMessage());
            }
            
        }
    }
}

public class MultithreadMain{
    public static void main(String[]args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Dorian");
        t2.setName("Ronnie");
        t1.start();
        t2.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());

    }
}
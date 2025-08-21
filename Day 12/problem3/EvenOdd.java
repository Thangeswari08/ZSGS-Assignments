class Printer {
     private int num = 1;
     private final int max = 20;

     public synchronized void printOdd(){
        while(num <= max){
            if(num % 2 == 1){
                System.out.println("Odd Thread :" + num);
                num++;
                notify();
            }
            else{
                try{
                    wait();
                }
                catch(InterruptedException e){
                     Thread.currentThread().interrupt();
                }
            }
        }
     }

     public synchronized void printEven(){
        while(num <= max){
            if(num % 2 == 0){
                System.out.println("Even Thread :" + num);
                num++;
                notify();
            }
            else{
                try{
                    wait();
                }
                catch(InterruptedException e){
                     Thread.currentThread().interrupt();
                }
            }
        }
     }
    
}

public class EvenOdd{
     public static void main (String [] args){
         Printer p = new Printer();

        Thread oddThread = new Thread(() -> p.printOdd(), "Odd");
        Thread evenThread = new Thread(() -> p.printEven(), "Even");

        oddThread.start();
        evenThread.start();

     }
}


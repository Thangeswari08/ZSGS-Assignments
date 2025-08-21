class TaskRunner implements Runnable {
    private String taskname;

    public TaskRunner( String taskname){
        this.taskname = taskname;
    }
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println("Thread :" + Thread.currentThread().getName()+ "-" + taskname + "- Step " + i);

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted :" + e.getMessage());
            }
        }
    }
}
public class Threadrunnable {
    public static void main (String [] args){
        
        TaskRunner t1 = new TaskRunner("Download File");
        TaskRunner t2 = new TaskRunner("Upload Data");

        Thread th1 = new Thread(t1, "Dorian");
        Thread th2 = new Thread(t2, "Ronnie");

        th1.start();
        th2.start();
        System.out.println("Main thread running: " + Thread.currentThread().getName());

    }
}

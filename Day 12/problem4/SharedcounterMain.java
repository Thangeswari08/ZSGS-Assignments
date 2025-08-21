class SharedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}

class CounterTask implements Runnable {
    private SharedCounter counter;

    public CounterTask(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SharedcounterMain {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        // Create 3 threads
        Thread t1 = new Thread(new CounterTask(counter), "Thread-1");
        Thread t2 = new Thread(new CounterTask(counter), "Thread-2");
        Thread t3 = new Thread(new CounterTask(counter), "Thread-3");

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }

        // Display final counter value
        System.out.println("Final Counter Value: " + counter.getValue());
    }
}
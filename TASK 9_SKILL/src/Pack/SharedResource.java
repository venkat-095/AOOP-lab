package Pack;


public class SharedResource {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
    }

    public int getCounter() {
        return counter;
    }
}


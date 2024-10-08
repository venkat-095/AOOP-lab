package Pack;

public class MainApp {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new Task(sharedResource), "Thread-1");
        Thread thread2 = new Thread(new Task(sharedResource), "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + sharedResource.getCounter());
    }
}

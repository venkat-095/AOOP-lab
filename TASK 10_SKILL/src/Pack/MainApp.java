package Pack;

public class MainApp {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        Thread producerThread = new Thread(new Producer(queue), "Producer");
        Thread consumerThread = new Thread(new Consumer(queue), "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}

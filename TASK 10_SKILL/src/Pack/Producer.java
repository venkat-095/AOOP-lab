package Pack;

public class Producer implements Runnable {
    private MessageQueue queue;

    public Producer(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int messageNumber = 1;
        try {
            while (true) {
                String message = "Message " + messageNumber;
                queue.produce(message);
                System.out.println("Produced: " + message);
                messageNumber++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
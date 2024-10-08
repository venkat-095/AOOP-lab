package Pack;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    private Queue<String> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce(String message) throws InterruptedException {
        while (queue.size() == LIMIT) {
            wait();
        }
        queue.add(message);
        notify();
    }

    public synchronized String consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        String message = queue.poll();
        notify();
        return message;
    }
}


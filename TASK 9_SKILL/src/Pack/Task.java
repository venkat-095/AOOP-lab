package Pack;


public class Task implements Runnable {
    private SharedResource sharedResource;

    public Task(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
        }
    }
}

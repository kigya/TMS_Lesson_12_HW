package task0;

public class MyRunnable implements Runnable {

    public void threadRunner() {
        System.out.println("Starting thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        threadRunner();
    }
}

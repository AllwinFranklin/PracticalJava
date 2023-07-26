package concurrency;

public class Concurrency {
    public static void run() {
        threadInterruption();
    }

    private static void threadInterruption() {
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}

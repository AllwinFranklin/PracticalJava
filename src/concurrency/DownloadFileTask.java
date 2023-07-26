package concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) return;

            System.out.println("Downloaded byte: " + i);
        }

        System.out.println("Download complete: "+Thread.currentThread().getName());
    }
}
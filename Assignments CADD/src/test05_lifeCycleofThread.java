public class test05_lifeCycleofThread {

    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            System.out.println("Worker: Starting...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Worker: Interrupted!");
            }
            System.out.println("Worker: Done.");
        });

        System.out.println("Main: Created worker.");
        worker.start();
        System.out.println("Main: Worker started.");

        try {
            worker.join();
        } catch (InterruptedException e) {
            System.out.println("Main: Interrupted while waiting.");
        }

        System.out.println("Main: Worker finished.");
    }
}

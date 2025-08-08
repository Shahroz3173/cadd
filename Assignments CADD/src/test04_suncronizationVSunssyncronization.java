public class test04_suncronizationVSunssyncronization {

    // 07 aug 25

    static int counter = 0;
    public static void incrementUnsync() {
        counter++;
    }
    public synchronized static void incrementSync() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        //unsync
        counter = 0;
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementUnsync();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementUnsync();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Unsynchronized counter: " + counter);

        System.out.println("___________________________________________");
        //sync
        counter = 0;
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementSync();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementSync();
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("Synchronized counter: " + counter);
    }
}

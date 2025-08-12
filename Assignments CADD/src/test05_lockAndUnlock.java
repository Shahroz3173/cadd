import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test05_lockAndUnlock {
    private final Lock lock = new ReentrantLock();

    public void doWork() {
        lock.lock();
        System.out.println("dowork is now locked");

        lock.unlock();
        System.out.println("dowork is now unlocked");

    }

    public static void main(String[] args) {
        test05_lockAndUnlock obj = new test05_lockAndUnlock();
        obj.doWork();
    }
}


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class aug04_lockMethod {
    public static void main(String[] args) {

    }
}
class threding {
    private final Lock lock = new ReentrantLock();
    private int count = 0;

    private void increament() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }

    }

    public int getCount() {
        lock.lock();
        try {
            return count;

        } finally {
            
        }

    }
}


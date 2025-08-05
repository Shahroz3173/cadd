public class Aug04_threading02 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}
class Counter {
    private int count = 0;
    public void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

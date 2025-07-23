import java.util.HashSet;

public class jul23_hashsetEqualOrNot {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(60);

        if (set1.equals(set2)) {
            System.out.println("Both HashSets are equal.");
        } else {
            System.out.println("HashSets are not equal.");
        }
        
    }
}

import java.util.HashSet;

public class jul23_DifferenceHashset {
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

        HashSet<Integer> difference = new HashSet<>(set1);

        difference.removeAll(set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Difference (Set1 - Set2): " + difference);

    }
}

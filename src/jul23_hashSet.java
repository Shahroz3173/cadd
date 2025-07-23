import java.util.HashSet;

import java.util.Collections;

public class jul23_hashSet {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        HashSet <Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(17);
        set1.add(18);

        HashSet<Integer> union = new HashSet<>(set);
        union.addAll(set1);
        System.out.println("Union: " + union);

        HashSet<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println("Intersection: " + intersection);

    }
}

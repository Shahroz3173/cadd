import java.util.HashSet;

public class jul23_uniqueElement {
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


        HashSet<Integer> duplicates = new HashSet<>(set1);
        duplicates.retainAll(set2);

        set1.removeAll(duplicates);
        set2.removeAll(duplicates);

        HashSet<Integer> unique = new HashSet<>(set1);
        unique.addAll(set2);
        System.out.println("Unique elements from both sets: " + unique);





    }
}

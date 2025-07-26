import java.util.*;
public class jul26_putVSputofabsent {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Alice");
        System.out.println("After " + map);
        map.put(0, "Bob");
        System.out.println("put again: " + map);

        map.putIfAbsent(0, "Charlie");
        System.out.println("After putIfAbsent: " + map);
        map.putIfAbsent(1, "New York");
        System.out.println("After putIfAbsent for new key: " + map);
    }
}

import java.util.HashMap;

public class jul24_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> mine = new HashMap<>();
        mine.put("shahroz",26);
        mine.put("sarthak",22);
        mine.put("aayush",19);
        mine.put("nidhi",20);
        mine.put("himanshu",22);

        Integer age = mine.get("aayush");
        System.out.println(age);

        mine.remove("aayush");
        System.out.println(mine);

        System.out.println(mine.size());

        System.out.println(mine.values());







    }
}

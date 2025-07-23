import java.util.ArrayList;

public class jul23_implimentHashset {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Original list: " + list);


        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if (!uniqueList.contains(val)) {
                uniqueList.add(val);
            }
        }

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}


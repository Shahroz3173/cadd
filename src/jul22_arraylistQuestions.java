import java.util.ArrayList;

public class jul22_arraylistQuestions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);

            System.out.println("Original ArrayList: " + list);

            Integer elementToRemove = 30;

            boolean isRemoved = list.remove(elementToRemove);

            if (isRemoved) {
                System.out.println("Element " + elementToRemove + " was removed.");
            } else {
                System.out.println("Element " + elementToRemove + " was not found.");
            }

            System.out.println("Updated ArrayList: " + list);
        }



}

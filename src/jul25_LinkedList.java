import java.util.LinkedList;

public class jul25_LinkedList {
    public static void main(String[] args) {
        // Using Java built-in LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0, 14);
        list.add(1, 15);
        list.add(2, 16);
        System.out.println("Built-in LinkedList: " + list);

        // Using custom linkedlist
        MyLinkedList myList = new MyLinkedList();
        myList.addEnd(14);
        myList.addEnd(15);
        myList.addEnd(16);
        myList.addEnd(17);
        myList.addEnd(18);

        System.out.print("Custom LinkedList: ");
        myList.printList();
    }
}


class MyLinkedList {
    private Node head;


    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

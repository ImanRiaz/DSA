public class linkedlist {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + data);
    }

    public void delete(int key) {
        Node current = head;
        Node previous = null;

        if (current != null && current.data == key) {
            head = current.next;
            System.out.println("Deleted: " + key);
            return;
        }

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value " + key + " not found.");
            return;
        }

        previous.next = current.next;
        System.out.println("Deleted: " + key);
    }

    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       linkedlist list = new linkedlist();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
        list.delete(20);
        list.printList();
        list.delete(40);
    }
}

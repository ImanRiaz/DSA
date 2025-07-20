public class Myname {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void add(String word) {
        Node newNode = new Node(word);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Myname list = new Myname();
        String sentence = "my name is iman riaz";
        String[] words = sentence.split(" ");
        for (String word : words) {
            list.add(word);
        }
        list.printList();
    }
}

package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;
    }

    public void delete(int value) {
        if (head == null)
            return;

        if (head.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node node = head;
        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }

            node = node.next;
        } while (node.next != head);
    }

    public void display() {
        if (head != null) {
            Node temp = head;

            do {
                System.out.print(temp.value + " - > ");
                temp = temp.next;
            } while (temp != head);

            System.out.println("HEAD");
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

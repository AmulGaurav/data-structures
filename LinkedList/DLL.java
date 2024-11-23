package LinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;

        if (head != null)
            head.prev = node;

        head = node;
    }

    public void insertLast(int value) {
        if (head == null)
            insertFirst(value);

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        Node node = new Node(value);
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }

        Node prev = find(after);

        if (prev == null)
            System.out.println("Node doesn't exist");

        if (prev.next == null) {
            insertLast(value);
            return;
        }

        Node node = new Node(value, prev, prev.next);
        prev.next = node;
        node.next.prev = node;
    }

    public Node find(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value)
                return node;

            node = node.next;
        }

        return null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " - > ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    private class Node {
        private int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}

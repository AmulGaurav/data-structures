package com.amul.datastructures;

public class DLL {
    private Node head;

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public Node find(int val) {
        Node node = head;

        while (node != null) {
            if (node.value == val)
                return node;

            node = node.next;
        }

        return null;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;

        if (head != null)
            head.prev = node;

        head = node;
    }

    public void insertLast(int val) {
        if (head == null)
            insertFirst(val);

        Node node = new Node(val);
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node node = new Node(val);
        Node prev = find(after);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;

        if (node.next != null)
            node.next.prev = node;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

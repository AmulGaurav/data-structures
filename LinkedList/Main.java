package LinkedList;

public class Main {

    public static void main(String[] args) {
        // LL l1 = new LL();
        // l1.insertFirst(5);
        // l1.insertFirst(8);
        // l1.insertFirst(59);
        // l1.insertFirst(51);

        // l1.insertLast(99);

        // l1.insert(7, 3);

        // l1.display();

        // System.out.println(l1.deleteFirst());
        // System.out.println(l1.deleteLast());
        // System.out.println(l1.delete(2));

        // l1.display();

        // System.out.println(l1.find(7));

        // DLL d1 = new DLL();
        // d1.insertFirst(43);
        // d1.insertFirst(4);
        // d1.insertFirst(65);
        // d1.insertFirst(8);

        // d1.insertLast(9);
        // d1.insertLast(90);

        // d1.insert(65, 0);
        // d1.insert(90, 0);

        // d1.display();

        CLL c1 = new CLL();
        c1.insertFirst(6);
        c1.insertFirst(8);
        c1.insertFirst(89);
        c1.insertFirst(67);

        c1.delete(6);
        c1.delete(89);
        c1.display();
    }
}
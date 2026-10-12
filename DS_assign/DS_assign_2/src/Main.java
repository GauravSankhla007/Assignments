public class Main {
    public static void main(String[] args) {

        MyLinkedList l = new MyLinkedList();

        l.insert(10, 0);       // empty list
        l.insert(20, 1);       // end
        l.insert(30, 1);       // middle

        l.remove_v(999);       // value doesn't exist
        l.remove(999);         // index doesn't exist

        System.out.println(l.retrieval(0));
        System.out.println(l.retrieval(999));

        l.reversal();
        l.sort();

        l.display();

    }
}
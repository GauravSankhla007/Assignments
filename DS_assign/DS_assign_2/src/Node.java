    public class Node {

        int value;
        Node next;
    }

    class MyLinkedList{
        Node head;

        void add_new(int value){
           if(head==null){
               Node node = new Node();
               node.value = value;
               head =  node ;
           }
           else {
               Node current = head;
               while(current.next != null) {
                   current= current.next;
               }
               Node nodi = new Node();
               nodi.value = value;
               current.next = nodi;
           }
        }

        void insert(int value , int index){
            Node newNode = new Node();
            if(index == 0){
                newNode.value = value;
                newNode.next = head ;
                head = newNode;
            }
            else {
                int count =0;
                Node current = head;
                while(current != null && count != index-1) {
                    current= current.next;
                    count++;
                }
                if (current == null){
                    return;
                }
                newNode.value=value;
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        void remove_v(int value) {
            if (head==null){
                return;
            }
            Node current = head;
            if (head.value == value) {
                head = current.next;
            } else {

                while (current.next!=null && current.next.value != value) {
                    current = current.next;
                }
                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
        }

        void remove(int index){
            if (head == null || index < 0) {
                return;
            }
            Node current = head;
            if(index==0){
                head = current.next;
            }
            else {
                int count =0;
                while (current.next != null && count != index-1){
                    current = current.next;
                    count++;
                }
                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
        }

        int retrieval(int index){
            if(head == null || index <0){
                return -1;
            }
            Node current = head;
            int count = 0;
            while(current!=null && count != index){
                current = current.next;
                count++;
            }
            if (current == null) {
                return -1;
            }

            return current.value;
        }

        void reversal() {

            Node current = head;
            Node next;
            Node previous = null;

            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }

        void sort(){
            Node current = head;
            Node next ;
            while (current!=null) {
                next = current.next;

                int temp = 0;
                while (next != null) {
                    if (current.value > next.value) {
                        temp = current.value;
                        current.value = next.value;
                        next.value = temp;
                    }
                    next = next.next;
                }
                current = current.next;
            }
        }

        void display() {
            Node current = head;

            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        }

    }
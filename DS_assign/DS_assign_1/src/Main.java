public class Main {
public static void main(String[] args) {

    MyArrList arr  = new MyArrList(5);

    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);

    arr.find(30);
    arr.addPos(99,2);
    arr.find(99);
    arr.find(30);
    arr.remove(4);
    arr.remove_v(99);
    arr.find(99);
    arr.reverse();
}
}
public class Main {
    public static void main(String[] args) {

        Library l1 = new Library("Gaurav", 225, "Student");

        l1.initialValue();
        l1.info();

        l1.borrowBook(2);
        l1.info();

        l1.depositBack(1);
        l1.info();

        l1.borrowBook(10);
        l1.info();
    }

}
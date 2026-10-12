public class Library {

    String name;
    int accountNumber;
    String type;
    int borrowBalance;

    Library(String name , int accountNumber, String type){
        this.name = name;
        this.accountNumber = accountNumber;
        this.type = type;
    }

    void initialValue(){
        if(type.equals("Teacher")){
            borrowBalance = 10;
        }
        else if (type.equals("Student")){
            borrowBalance = 5;
        }

    }
    void depositBack(int books){
        borrowBalance += books;
        System.out.println("You have returned the books");
    }
    void borrowBook(int books){
        if(books <= borrowBalance ){
            borrowBalance -= books;
            System.out.println("You can borrow the books");
        }
        else {
            System.out.println("You cannot borrow the books ");
        }
    }
    void info(){
        System.out.println(name + " " + borrowBalance);
    }

}

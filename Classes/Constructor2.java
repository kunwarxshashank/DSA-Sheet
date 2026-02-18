class Book{
    String bookname;
    int price;

    // Creating a default constructor
    Book(){
        System.out.println("This is default book constructor");
    }


    // Creating a parametric constructor
    Book(String bookname, int price){
        /*
            bookname = bookname;
            price = price;
            
            Yaha pe compiler confuse ho jaega ki,
            bookname paramter se arha hai ya Class ke variable se
        */ 



        // yaha pe this current class ke objects ko point kr rha hai...
        this.bookname = bookname;
        this.price = price;
        System.out.println("Book: "+bookname+" & Price: "+price);
    }

    // Creating a copy constructor
    Book(Book b){
        bookname = b.bookname;
        price = b.price;
        System.out.println("Book: "+bookname+" & Price: "+price);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        // Constructor called automatically while creating object
        Book b1 = new Book();
        Book b2 = new Book("Gunaho Ka Devta", 100);
        Book b3 = new Book(b2);
    }
}

package ClasAndObjec;
import java.util.Scanner;

public  class Book {
    String title;
    String author;
    String isbn;
    Book(){

    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayLibrary(Book[] library) {
        for(int i = 0; i<library.length;i++ ) {
            System.out.println("Title : " + library[i].title);
            System.out.println("Author : " + library[i].author);
            System.out.println("isbn: " + library[i].isbn);
        }
        }
        void searchBook(String i , Book[]library){
        int z;
        boolean found = false;
        for( z=0; z < library.length; z++){
            if (library[z].title.equals(i)) {
                System.out.println("Title : " + library[z].title);
                System.out.println("Author : " + library[z].author);
                System.out.println("isbn: " + library[z].isbn);
                found = true;
            }
        }
            if(!found){
                System.out.println("The book is notin the library.");
            }
        }
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Book[] library = {
                new Book("To Kill a Mockingbird","Harper Lee","978-0060935467"),
                new Book("1984","George Orwell","978-0451524935"),
                new Book("The Great Gatsby","F.Scott Fitzgerald","978-0743273565"),
                new Book("Pride and prejudice","Jane Austen","978-0141439518"),
                new Book("The Hobbit","J.R.R. Tolkien","978-0547928227")
        };

        Book n = new Book();
        n.displayLibrary(library);
        System.out.print("Enter the book name :");
        String s = r.nextLine();
        n.searchBook(s,library);
    }
}
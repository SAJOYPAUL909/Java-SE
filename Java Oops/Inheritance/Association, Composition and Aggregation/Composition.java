import java.util.ArrayList;
import java.util.List;

class Book
{
    String title;
    String author;

    Book (String title , String author)
    {
        this.title = title;
        this.author = author;
    }
}

class Library
{
    private final List <Book> books;

    Library(List<Book> books)
    {
        this.books = books;
    }

    public List<Book> getBooks()
    {
        return books;
    }


}

public class Composition 
{
    public static void main(String[] args) 
    {
        Book b1 = new Book("Aptitude", "R. K. Aggrawal");
        Book b2 = new Book("Maths", "R. D. Sharma");
        Book b3 = new Book("Physics", "H. C. Verma");

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);

        List<Book> b = library.getBooks();

        for (Book bk : b )
        System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);

    }    
}

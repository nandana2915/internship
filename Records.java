import java.util.List;
import java.util.stream.Collectors;

class Book 
{
    private String title;
    private String author;
    private int publicationYear;

    
    public Book(String title, String author, int publicationYear) 
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    
    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public int getPublicationYear() 
    {
        return publicationYear;
    }

    
    public String toString() 
    {
        return "Title: " + title + ", Author: " + author + ", Year: " + publicationYear;
    }
}

public class Records 
{
    public static void main(String[] args) 
    {
       
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book One", "Author A", 2008));
        books.add(new Book("Book Two", "Author B", 2012));
        books.add(new Book("Book Three", "Author C", 2015));
        books.add(new Book("Book Four", "Author D", 2005));
        books.add(new Book("Book Five", "Author E", 2020));

        
        List<Book> booksAfter2010 = books.stream()
                .filter(book -> book.getPublicationYear() > 2010)
                .collect(Collectors.toList());

        
        System.out.println("Books published after 2010:");
        booksAfter2010.forEach(System.out::println);
    }
}

package interitance_HAS_A;

class Book {
    String name;
    int price;
    
    Author author;
    Publisher publisher;

    Book(String name, int price, Author author, Publisher publisher) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

//public class main {
    public static void main(String[] args ) {
        // Creating instances of Author, Publisher and Book classes
        Author author = new Author("Micheal", 32, "USA");
        Publisher publisher = new Publisher("Sun Publisher", "ABC-1110", "London");
        Book b = new Book("Core Java", 800, author, Publisher);

        // Printing book, author and publisher details
        System.out.println("Book name: " + b.name);
        System.out.println("Book price: " + b.price);

        System.out.println("Author Name: " + b.author.name);
        System.out.println("Author Age: " + b.author.age);
        System.out.println("Author Place: " + b.author.place);

        System.out.println("Publisher Name: " + b.publisher.name);
        System.out.println("Publisher ID: " + b.publisher.ID);
        System.out.println("Publisher City: " + b.publisher.city);
    }
}
package interitance_HAS_A;

class Author {
    String name;
    int age;
    String place;

    public Author(String name, int age, String place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }
}

class Publisher {
    String name;
    String publisher_id;
    String city;

    public Publisher(String name, String publisher_id, String city) {
        this.name = name;
        this.publisher_id = publisher_id;
        this.city = city;
    }
}

class Book {
    String name;
    int price;
    Author author;
    Publisher publisher;

    public Book(String name, int price, Author author, Publisher publisher) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }
}

public class Book_Details {
	public static void main(String[] args) {
        // Creating instances of Author, Publisher and Book classes
        Author author = new Author("Micheal", 32, "USA");
        Publisher publisher = new Publisher("Sun Publisher", "ABC-1110", "London");
        Book book = new Book("Core Java", 800, author, publisher);

        // Printing book, author and publisher details
        System.out.println("Book name: " + book.name);
        System.out.println("Book price: " + book.price);

        System.out.println("\nAuthor Name: " + book.author.name);
        System.out.println("Author Age: " + book.author.age);
        System.out.println("Author Place: " + book.author.place);

        System.out.println("\nPublisher Name: " + book.publisher.name);
        System.out.println("Publisher ID: " + book.publisher.publisher_id);
        System.out.println("Publisher City: " + book.publisher.city);
    }
}








}

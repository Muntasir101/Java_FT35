package day4_OOP;

// Abstraction Example

// Abstract class for Book
abstract class BookTemplate {
    String title;
    String author;

    // Abstract method
    abstract void read();

    // Abstract method
    abstract void price();

    // Concrete method
    void review() {
        System.out.println("Good Review.");
    }
}

// Subclass 1: Fiction
class Fiction extends BookTemplate {
    @Override
    void read() {
        System.out.println("Reading a Fiction storybook.");
    }
    @Override
    void price(){
        System.out.println("Fiction Book price $100");
    }
}

// Subclass 2: NonFiction
class NonFiction extends BookTemplate {
    @Override
    void read() {
        System.out.println("Reading an informative Non-Fiction book.");
    }
    @Override
    void price(){
        System.out.println("No-Fiction Book price $200");
    }
}

// Subclass 3: Novel
class Novel extends BookTemplate {
    @Override
    void read() {
        System.out.println("Reading an informative Novel book.");
    }
    @Override
    void price(){
        System.out.println("Novel Book price $300");
    }
}

// Main class
public class Book {
    public static void main(String[] args) {
        BookTemplate book1 = new Fiction();
        book1.title = "The Alchemist";
        book1.author = "Paulo Coelho";
        System.out.println(book1.title);
        book1.price();
        book1.read();
        book1.review();

        BookTemplate book2 = new NonFiction();
        book2.title = "Sapiens";
        book2.author = "Yuval Noah Harari";
        System.out.println(book2.title);
        book2.price();
        book2.read();
        book2.review();

        BookTemplate book3 = new Novel();
        book3.title = "";
        book3.author = "";
        book3.price();
        book3.read();
        book3.review();

    }
}

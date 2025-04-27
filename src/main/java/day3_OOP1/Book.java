package day3_OOP1;

public class Book {
    String BookName;
    String Author;
    int Year;

    private int price(int amount){
        return amount;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.BookName = "Quantum Physics";
        book1.Author = "Mr.ABC";
        book1.Year = 2010;
        book1.price(500);

        Book book2 = new Book();
        book2.BookName = "Quantum Math";
        book2.Author = "Mr.DEF";
        book2.Year = 2000;
        book2.price(1000);

        Book book3 = new Book();
        book3.BookName = "Quantum Chemistry";
        book3.Author = "Mr.MRR";
        book3.Year = 1995;
        book3.price(800);

        System.out.println(book1.Author);
        System.out.println(book2.Author);
        System.out.println(book3.Author);

        System.out.println(book1.price(300));

    }

}

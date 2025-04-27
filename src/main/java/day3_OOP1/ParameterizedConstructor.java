package day3_OOP1;

public class ParameterizedConstructor {
    String BookName;
    String Author;
    int Year;

    ParameterizedConstructor(String bookName,String author,int year){
        BookName = bookName;
        Author = author;
        Year = year;
    }

    public static void main(String[] args) {
        ParameterizedConstructor book1 = new ParameterizedConstructor("Quantum Physics","Green", 1970);
        ParameterizedConstructor book2 = new ParameterizedConstructor("Quantum Math","Wood", 1990);
        ParameterizedConstructor book3 = new ParameterizedConstructor("English Story","Smith", 1990);

        System.out.println(book1.Author);

    }

}

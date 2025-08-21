class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return "Book[Title=" + title + ", Author=" + author + "]";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "John");
        System.out.println(b);  
    }
}

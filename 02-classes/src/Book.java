public class Book {
    String title;
    String author;
    int pages;
    int year;

    Book(){
        title = "Unknown";
        author = "Unknown";
        pages = 0;
        year = 0;
        System.out.println("Default constructor called");
    }

    Book(String title, String author, int pages, int year){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }

    void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Year: " + year);
    }
}

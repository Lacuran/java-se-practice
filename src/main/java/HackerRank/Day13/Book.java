package HackerRank.Day13;

public abstract class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

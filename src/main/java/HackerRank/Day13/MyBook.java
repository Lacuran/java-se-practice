package HackerRank.Day13;

public class MyBook extends Book{
    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println(String.format("Title: %s\nAuthor: %s\nPrice: %s"
                ,getTitle() ,getAuthor(), price));
    }
}

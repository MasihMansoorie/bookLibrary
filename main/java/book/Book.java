package book;

public class Book {

    private String name;
    private String author;
    private double price;
    private int page;


    public Book(String name, String author, double price, int page){
        this.name = name;
        this.author = author;
        this.price = price;
        this.page = page;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", page=" + page +
                '}';
    }
}

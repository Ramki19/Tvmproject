public class Book {
    private String bookid;
    private String title;
    private String author;
    private String available;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public Book(String available, String bookid, String title, String suthor) {
        this.available = available;
        this.bookid=bookid;
        this.author=author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

public class Book {
    private String bookName;
    private int pageNumber;
    private String author;
    private int releaseDay;

    public Book(String bookName, int pageNumber, String author, int releaseDay) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.releaseDay = releaseDay;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }
}
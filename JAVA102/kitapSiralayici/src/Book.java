public class Book {
    private String bookName;
    private int NumberOfPages;
    private String authorsName;//yazar adı
    private int publicationDate;//yayın tarihi

    public Book(String bookName, int numberOfPages, String authorsName, int publicationDate) {
        this.bookName = bookName;
        NumberOfPages = numberOfPages;
        this.authorsName = authorsName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}

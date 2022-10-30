public class Book {
    private final String bookName;
    private final Author authorNameAndSurname;
    private int publishingYear;
    public Book(String bookName, Author authorNameAndSurname, int publishingYear) {
        this.bookName = bookName;
        this.authorNameAndSurname = authorNameAndSurname;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getAuthorNameAndSurname() {
        return authorNameAndSurname;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

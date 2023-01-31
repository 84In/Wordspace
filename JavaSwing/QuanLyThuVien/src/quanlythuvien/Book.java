public class Book {
    private String nameBook;
    private float priceBook;
    private Date pushlishDate;
    private Author author;

    public Book() {
        this.nameBook = new String();
        this.priceBook = 0.0f;
        this.pushlishDate = new Date();
        this.author = new Author();
    }

    public Book(String nameBook, float priceBook, int pushlishDate, Author author) {
        this.pushlishDate = new Date();
        this.nameBook = new String(nameBook);
        this.priceBook = priceBook;
        this.pushlishDate.setYear(pushlishDate);
        this.author = new Author(author);
    }

    public Book(Book x) {
        this.nameBook = new String(x.nameBook);
        this.priceBook = x.priceBook;
        this.pushlishDate.setYear(x.pushlishDate.getYear());
        this.author = new Author(x.author);
    }

    public void printNameBook() {
        System.out.println(this.nameBook);
    }

    public int getPushLishDate() {
        return pushlishDate.getYear();
    }

    public boolean checkPushLishDate(Book x) {
        if (pushlishDate.getYear() == (x.getPushLishDate()))
            return true;
        return false;
    }

    public float priceDiscount(int x) {
        return (float) (1 - x / 100) * this.priceBook;
    }

    public String toString() {
        return "(" + nameBook + "; " + priceBook + "; " + pushlishDate.getYear() + "; " + author + ")";
    }
}

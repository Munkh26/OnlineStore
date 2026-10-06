public class Book extends ItemForSale
{
    private String publisher;

    public Book(String name, String date, double price, Author author, String publish) {
        super(name, date, price, author);
        publisher = publish;
    }
}

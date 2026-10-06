
public class Book extends ItemForSale
{
    Author author;
    String publisher;
    public Book(String publish, String date, double price) {
        super("Book", date, price);
        publisher = publish;
    }

}

//Name: Munkhsoyombo Munkhbat
//Date: 10/06/2026

public class Book extends ItemForSale
{
    //Instance variable
    private String publisher;

    //Constructor
    public Book(String name, String date, double price, Author author, String publish) {
        super(name, date, price, author);
        publisher = publish;
    }

    //Getter Methods
    public String getPublisher() {
        return publisher;
    }

}

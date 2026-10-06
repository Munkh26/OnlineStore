public class Movie extends ItemForSale
{
    private double duration;
    private Author author;

    public Movie(String name, String date, double price, Author author, double dur) {
        super(name, date, price, author);
        duration = dur;
    }

}

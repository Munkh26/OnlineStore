public class Movie extends ItemForSale
{
    Author author;
    double duration;

    public Movie(double dur, String date, double price) {
        super("Movie", date, price);
        duration = dur;
    }



}

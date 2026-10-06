//Name: Munkhsoyombo Munkhbat
//Date: 10/06/2026

public class Movie extends ItemForSale
{
    //Instance variables
    private double duration;

    //Constructor
    public Movie(String name, String date, double price, Author author, double dur) {
        super(name, date, price, author);
        duration = dur;
    }

    //Getter method
    public double getDuration() {
        return duration;
    }
}

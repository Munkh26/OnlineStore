//Name: Munkhsoyombo Munkhbat
//Date: 10/06/2026

public class ItemForSale
{
    //Instance variables
    private String itemName;
    private String datePlaced;
    private double price;
    private Author author;

    //Constructor
    public ItemForSale(String name, String date, double cost, Author authorPerson) {
        itemName = name;
        datePlaced = date;
        price = cost;
        author = authorPerson;
    }

    //Getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getDatePlaced(){
        return datePlaced;
    }


}

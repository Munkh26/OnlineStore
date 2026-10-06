public class ItemForSale
{
    private String itemName;
    private String datePlaced;
    private double price;
    private Author author;

    public ItemForSale(String name, String date, double cost, Author authorPerson) {
        itemName = name;
        datePlaced = date;
        price = cost;
        author = authorPerson;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }


}

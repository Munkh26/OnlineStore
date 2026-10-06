//Name: Munkhsoyombo Munkhbat
//Date: 10/06/2026
//Description: Make a onlineStore where you can add items like books and movies for sale, and you can sell those products to increase the store profit. You are also able to get the specific product's properties like author's name, title, etc. 

/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
import java.util.*;

public class Store
{
  // Instance Variables
  private double profit;
  private ArrayList<ItemForSale> items;

  // Constructor
  public Store() {
    profit = 0;
    items = new ArrayList<ItemForSale>();
  }

  // Methods
  // It shows all the items for sale
  public void showItems() {
    String result = "";
    for (int i = 0; i < items.size(); i++) {
      result += "[" + items.get(i).getItemName() + "]";
    }
    System.out.println(result);
  }

  //Adds a item to ItemForSale
  public void addItem(ItemForSale item) {
    if (item != null) {
      items.add(item);
    }
  }

  //Sells the item from the ItemForSale (if there is duplicate, it only sells one)
  public void sellItem(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getItemName().equals(itemName)) {
        profit += items.get(i).getPrice();
        items.remove(i);
        return;
      }
    }
  }

  //Shows who created the ItemForSale like the author's name (if there is duplicate products like two same books, it only shows one author's name)
  public void creator(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getItemName().equals(itemName)) {
        System.out.println(items.get(i).getAuthor().getName());
        return;
      }
    }
  }

  //Shows the total profit
  public double getProfit(){
    return profit;
  }
}

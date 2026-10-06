//Name: Munkhsoyombo Munkhbat



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
  private double profit;
  private ArrayList<ItemForSale> items;

  public Store() {
    profit = 0;
    items = new ArrayList<ItemForSale>();
  }

  public void showItems() {
    String result = "";
    for (int i = 0; i < items.size(); i++) {
      result += items.get(i).getItemName() + ", ";
    }
    System.out.println(result);
  }

  public void addItem(ItemForSale item) {
    items.add(item);
  }

  public void sellItem(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getItemName().equals(itemName)) {
        profit += items.get(i).getPrice();
        items.remove(i);
        i--;
      }
    }
  }

  public void creator(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getItemName().equals(itemName)) {
        System.out.println(items.get(i).getAuthor().name);
      }
    }
  }

  public double getProfit(){
    return profit;
  }


}

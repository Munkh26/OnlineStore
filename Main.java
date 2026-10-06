//Name: Munkhsoyombo Munkhbat
//Date: 10/06/2026
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
      //Creating the objects to test the code
        Store s = new Store();
        Author author = new Author("Tappei Nagatsuki", "March 11, 1987");
        Book b = new Book("Re:Zero", "October 6, 2026", 10, author, "MF Bunko");
        System.out.println(b instanceof ItemForSale);
        Author author2 = new Author("James Dashner", "November 26, 1972");
        Movie m = new Movie("Maze Runner", "October 6, 2026", 20, author2, 113);
        System.out.println(m instanceof ItemForSale);
        //Testing the methods using the objects from above
        s.addItem(null); //tries adding null item to the ArrayList
        s.sellItem(m.getItemName()); // tries selling an item not in the list
        s.sellItem("aaaa"); // tries selling an item not in the list
        s.addItem(b); // all below are valid test
        s.addItem(m);
        s.addItem(b);
        s.showItems();
        s.sellItem(b.getItemName()); // Should sell only one if there is duplicate product
        s.showItems();
        s.creator(m.getItemName());
        System.out.println(s.getProfit());
     }
}

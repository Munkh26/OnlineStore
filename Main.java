
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Author author = new Author("Tappei Nagatsuki", "March 11, 1987");
        Book b = new Book("Re:Zero", "October 6, 2026", 10, author, "MF Bunko");
        System.out.println(b instanceof ItemForSale);
        Author author2 = new Author("James Dashner", "November 26, 1972");
        Movie m = new Movie("Maze Runner", "October 6, 2026", 20, author2, 113);
        System.out.println(m instanceof ItemForSale);
        
        s.addItem(b);
        s.addItem(m);
        s.showItems();
        s.sellItem(b.getItemName());
        s.showItems();
        s.creator(m.getItemName());
        System.out.println(s.getProfit());


     }
}

import java.util.TreeSet;


class Item implements Comparable<Item> 
{
    private String name;
    private int price;

    public Item(String name, int price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public int getPrice() 
    {
        return price;
    }

    
    
    public int compareTo(Item other) 
    {
        return Integer.compare(this.price, other.price);
    }

    
    public String toString() 
    {
        return name + ": " + price;
    }
}

public class Electronics
{
    public static void main(String[] args) 
    {
        
        TreeSet<Item> items = new TreeSet<>();

        // Add elements to the TreeSet
        items.add(new Item("Laptop", 1000));
        items.add(new Item("Phone", 500));
        items.add(new Item("Monitor", 300));
        items.add(new Item("Headphones", 150));

      
        System.out.println("Items sorted by price:");
        for (Item item : items) 
        {
            System.out.println(item);
        }
    }
}
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Item 
{
    private String day;
    private int price;

    public Item(String day, int price) 
    {
        this.day = day;
        this.price = price;
    }

    public String getDay() 
    {
        return day;
    }

    public int getPrice() 
    {
        return price;
    }
}

public class TotalPrice 
{
    public static void main(String[] args) 
    {
        
        List<Item> items = Arrays.asList(
            new Item("Sunday", 700),
            new Item("Sunday", 200),
            new Item("Monday", 300),
            new Item("Monday", 400),
            new Item("Tuesday", 500)
        );

        
        Map<String, Integer> totalPricePerDay = items.stream()
            .collect(Collectors.groupingBy(Item::getDay, Collectors.summingInt(Item::getPrice)));

      
        totalPricePerDay.forEach((day, totalPrice) -> 
            System.out.println("Total price for " + day + ": " + totalPrice)
        );
    }
}
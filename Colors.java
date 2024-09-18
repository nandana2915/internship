import java.util.*;

public class Colors 
{
    public static void main(String[] args) 
    {
        
        List<String> items = new ArrayList<>(Arrays.asList("Yellow", "White", "Purple", "Orange"));

        
        System.out.println("Using Enumeration:");
        Vector<String> vector = new Vector<>(items);
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) 
        {
            System.out.println(enumeration.nextElement());
        }

       
        System.out.println("Using Iterator:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) 
        {
            String item = iterator.next();
            System.out.println(item);
            if (item.equals("Purple")) 
            {
                iterator.remove();
            }
        }


        System.out.println("List after removing 'Purple' using Iterator: " + items);


        System.out.println("Using ListIterator:");
        ListIterator<String> listIterator = items.listIterator();
        while (listIterator.hasNext()) 
        {
            String item = listIterator.next();
            System.out.println(item);
            if (item.equals("White")) 
            {
                listIterator.set("Black");  
            }
        }


        System.out.println("List after modifying 'White' to 'Black' using ListIterator: " + items);
    }
}
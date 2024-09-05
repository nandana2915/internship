import java.util.ArrayList;

public class listing
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> list = new ArrayList<>();
        
        
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        
        System.out.println("Original List: " + list);
        
        
        if (list.size() > 2) 
        {  
            list.remove(2);  
        }
        
        
        System.out.println("Modified List after removing the third element: " + list);
    }
}

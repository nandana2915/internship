import java.util.ArrayList;

public class Fruits
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Cherry");

        
        ArrayList<String> destinationList = new ArrayList<>(sourceList);

        
        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List after copying: " + destinationList);
    }
}

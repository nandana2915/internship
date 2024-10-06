import java.util.*;

public class HashSetCheck 
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));

        
        if (set.contains("banana")) 
        {
            System.out.println("HashSet contains 'banana'.");
        } else 
        {
            System.out.println("HashSet does not contain 'banana'.");
        }
    }
}

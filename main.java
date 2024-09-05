import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main 
{
    public static void main(String[] args) 
    {
        
        List<Integer> numbers = Arrays.asList(1, 34, 22, 13, 55, 4, 3, 87, 11, 22, 12);
        
        
        List<Integer> filteredAndSorted = numbers.stream()
                .filter(num -> num % 2 == 0)   
                .sorted()                      
                .collect(Collectors.toList());

        
        System.out.println("Filtered and Sorted List: " + filteredAndSorted);
    }
}

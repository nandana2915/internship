import java.io.*;
import java.util.*;

class PositiveNumberException extends Exception 
{
    public PositiveNumberException(String message) 
    {
        super(message);
    }
}

public class NegativeNumberChecker {
    public static void checkForPositiveNumbers(List<Integer> numbers) throws PositiveNumberException
    {
        for (int number : numbers) 
        {
            if (number > 0) 
            {
                throw new PositiveNumberException("Positive number found: " + number);
            }
        }
    }

    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                numbers.add(Integer.parseInt(line));
            }
            checkForPositiveNumbers(numbers);
        } catch (IOException | PositiveNumberException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

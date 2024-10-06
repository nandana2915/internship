import java.io.*;

public class Trywithresourcesexample 
{
    public static void main(String[] args) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

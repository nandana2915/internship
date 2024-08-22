import java.util.Scanner;  
  
public class CapitalizeFirstLetter 
{  
   public static void main(String[] args) 
   {  
      Scanner scanner = new Scanner(System.in);  
  
      System.out.print("Input: ");  
      String str = scanner.nextLine();  
  
      String[] words = str.split(" ");  
      StringBuilder capitalizedStr = new StringBuilder();  
  
      for (String word : words) 
      {  
        capitalizedStr.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");  
      }  
  
      System.out.println("Capitalized string: " + capitalizedStr.toString().trim());  
   }  
}
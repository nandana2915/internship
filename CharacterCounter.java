import java.util.Scanner;

public class CharacterCounter 

{  
   public static void main(String[] args) 
   {  
      Scanner scanner = new Scanner(System.in);  
  
      System.out.print("Enter a string: ");  
      String str = scanner.next();  
  
      System.out.print("Enter a character: ");  
      char ch = scanner.next().charAt(0);  
  
      int count = 0;  
      for (int i = 0; i < str.length(); i++) 
      {  
        if (str.charAt(i) == ch) 
        {  
           count++;  
        }  
      }  
  
      System.out.println("The character '" + ch + "' appears " + count + " times in the string.");  
   }  
}

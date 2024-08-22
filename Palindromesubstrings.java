import java.util.ArrayList;
import java.util.List;

public class PalindromeSubstrings 
{
    public static List<String> findPalindromes(String str) 
    {
        List<String> palindromes = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
           
            expandPalindrome(str, i, i, palindromes);

           
            expandPalindrome(str, i, i + 1, palindromes);
        }

        return palindromes;
    }

    private static void expandPalindrome(String str, int left, int right, List<String> palindromes) 
    {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
 {
            palindromes.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) 
    {
        String
        String = "Madam";
        List<String> palindromicSubstrings = findPalindromes(String);
        System.out.println(palindromicSubstrings);
    }
}
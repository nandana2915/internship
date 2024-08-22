public class ASCIIValueDifference
{
    public static String formDifferenceString(String s) 
    {
        if (s == null || s.length() < 2) 
        {
            return s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) 
        {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            int difference = nextChar - currentChar;

            result.append(currentChar).append(difference);
        }

        result.append(s.charAt(s.length() - 1));

        return result.toString();
    }

    public static void main(String[] args) 
    {
        String input = "abecd";
        String result = formDifferenceString(input);
        System.out.println(result); 
    }
}
class NoVowelException extends Exception
{
    public NoVowelException(String message)
    {
        super(message);
    }
}

public class VowelChecker
{
    public static void checkForVowels(String input) throws NoVowelException
    {
        if(!input.matches(".*[aeiouAEIOU].*"))
        {
            throw new NoVowelException("The string does not contain any vowels.")

        }
        else 
        {
            System.out.println("The string contains vowels.");

        }
    } 

    public static void main(String[] args)
    {
        try
        {
            checkForVowels("bcdfg");

        }
        catch (NoVowelException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            checkForVowels("hello");
        }
        catch(NoVowelException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
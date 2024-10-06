import java.util.*;

public class Arrayintersection 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        int n1 = sc.nextInt();
        Set<Integer> setA1 = new HashSet<>();
        for (int i = 0; i < n1; i++) 
        {
            setA1.add(sc.nextInt());
        }

       
        int n2 = sc.nextInt();
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for (int i = 0; i < n2; i++) 
        {
            int num = sc.nextInt();
            if (setA1.contains(num)) 
            {
                result.add(num);
            }
        }

       
        for (int num : result) 
        {
            System.out.println(num);
        }
    }
}

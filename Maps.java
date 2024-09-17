import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps 
{
    public static void main(String[] args) 
    {
        
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "HR");
        map1.put(2, "Development");
        map1.put(3, "UI/UX");
        map1.put(4, "Tech Support");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "HR");
        map2.put(2, "Devops");
        map2.put(3, "UI/UX");

        
        Iterator<Map.Entry<Integer, String>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (!map2.containsKey(entry.getKey()))
            {
                iterator.remove();
            }
        }

        
        System.out.println("Modified map1: " + map1);
    }
}

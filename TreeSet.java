public class TreeSet
{
    public static void main(String[] args) 
    {
      
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() 
        {
            
            public int compare(Integer o1, Integer o2) 
            {
                return o2.compareTo(o1);  
            }
        });

        
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        
        System.out.println("TreeSet in descending order: " + treeSet);
    }
}
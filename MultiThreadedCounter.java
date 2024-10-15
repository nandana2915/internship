class Counter 
{
    private int count = 0;

    
    public synchronized void increment() 
    {
        count++;
    }

    
    public int getValue() 
    {
        return count;
    }
}

class CounterIncrementer implements Runnable 
{
    private Counter counter;

    
    public CounterIncrementer(Counter counter) 
    {
        this.counter = counter;
    }

    
    public void run() 
    {
        for (int i = 0; i < 1000; i++) 
        {
            counter.increment();  
    }
}

public class MultiThreadedCounter 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Counter counter = new Counter();  

        
        Thread t1 = new Thread(new CounterIncrementer(counter));
        Thread t2 = new Thread(new CounterIncrementer(counter));
        Thread t3 = new Thread(new CounterIncrementer(counter));

        
        t1.start();
        t2.start();
        t3.start();

       
        t1.join();
        t2.join();
        t3.join();

  
        System.out.println("Final counter value: " + counter.getValue());
    }
}

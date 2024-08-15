enum TrafficLight 
{
    RED("Stop"),
    YELLOW("Prepare to stop"),
    GREEN("Go");

    String action; 

    TrafficLight(String action) 
    {
        this.action = action;
    }

    public String getAction() 
    {
        return action;
    }
}

public class TrafficLightTest 
{
    public static void main(String[] args) 
    {
        TrafficLight light = TrafficLight.RED; 
        System.out.println(light + ": " + light.getAction());
    }
}

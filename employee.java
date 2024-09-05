import java.util.List;
import java.util.stream.Collectors;

class Employee 
{
    private String name;
    private int age;
    private double salary;

    
    public Employee(String name, int age, double salary) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public int getAge() 
    {
        return age;
    }

    public double getSalary() 
    {
        return salary;
    }

    
    public String toString() 
    {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}

public class employee 
{
    public static void main(String[] args) 
    {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 28, 45000));
        employees.add(new Employee("Mary", 32, 55000));
        employees.add(new Employee("Mike", 45, 75000));
        employees.add(new Employee("Sara", 25, 30000));
        employees.add(new Employee("Tom", 35, 65000));

        
        OptionalDouble averageSalary = employees.stream()
                .filter(employee -> employee.getAge() > 30)  
                .mapToDouble(Employee::getSalary)            
                .average();                                  

        
        if (averageSalary.isPresent()) 
        {
            System.out.println("Average salary of employees older than 30: " + averageSalary.getAsDouble());
        } else 
        {
            System.out.println("No employees older than 30");
        }
    }
}

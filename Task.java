import java.time.LocalDate;

public class Task 
{
    private static int nextId = 1;
    private int id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String category;
    private TaskStatus status; 

    public Task(String title, String description, LocalDate dueDate, String category) 
    {
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.status = TaskStatus.PENDING; 
    }

    
    public int getId() 
    {
        return id;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getDescription() 
    {
        return description;
    }

    public LocalDate getDueDate() 
    {
        return dueDate;
    }

    public String getCategory() 
    
    {
        return category;
    }

    public TaskStatus getStatus() 
    {
        return status;
    }

    public void setStatus(TaskStatus status) 
    {
        this.status = status;
    }
}


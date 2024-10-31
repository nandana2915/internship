import java.time.LocalDate;

public class Task 
{
    private int id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String category;
    private TaskStatus status;

    public Task(int id, String title, String description, LocalDate dueDate, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.status = TaskStatus.NOT_STARTED; // Default status
    }

    public int getId()
    {
        return id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // Overriding toString() method to get readable output
    @Override
    public String toString() {
        return "Task{" +
               "title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", dueDate=" + dueDate +
               ", category='" + category + '\'' +
               ", status=" + status +
               '}';
    }
}

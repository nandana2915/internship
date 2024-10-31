import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager 
{

    private List<Task> tasks;
    private List<Category> categories;

    public TaskManager() 
    {
        tasks = new ArrayList<>();
        categories = new ArrayList<>();
    }

    
    public void addTask(Task task) 
    {
        tasks.add(task);
    }

    
    public void addCategory(Category category) 
    {
        categories.add(category);
    }

    
    public List<Task> getTasksByCategory(String categoryName) 
    {
        if ("All".equalsIgnoreCase(categoryName)) 
        {
            return 
        }
        return tasks.stream()
                .filter(task -> task.getCategory().equalsIgnoreCase(categoryName))
                .collect(Collectors.toList());
    }

    public List<Task> getTasks() 
    {
        return tasks;
    }
    

    
    public List<Task> getTasksSortedByDueDate() 
    {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
    }

    
    public void changeTaskStatus(int taskId, String status) 
    {
        Task task = findTaskById(taskId);
        if (task != null) 
        {
            try 
            {
                TaskStatus taskStatus = TaskStatus.valueOf(status.toUpperCase());
                task.setStatus(taskStatus);
                System.out.println("Task status updated to: " + taskStatus);
            } catch (IllegalArgumentException e) 
            {
                System.out.println("Invalid status. Valid statuses are: NOT_STARTED, IN_PROGRESS, COMPLETED.");
            }
        } else 
        {
            System.out.println("Task not found.");
        }
    }

    
    private Task findTaskById(int taskId) 
    {
        return tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .orElse(null);
    }

    
    public void printTaskSummary() 
    {
        long totalTasks = tasks.size();
        long completedTasks = tasks.stream()
                .filter(task -> task.getStatus() == TaskStatus.COMPLETED)
                .count();
        long pendingTasks = totalTasks - completedTasks;

        System.out.println("Task Summary:");
        System.out.println("Total tasks: " + totalTasks);
        System.out.println("Completed tasks: " + completedTasks);
        System.out.println("Pending tasks: " + pendingTasks);
    }

    
    public List<Category> getCategories() 
    {
        return categories;
    }
}

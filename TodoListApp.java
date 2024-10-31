import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;
import java.time.format.DateTimeParseException;


public class TodoListApp 
{

    private static TaskManager taskManager = new TaskManager();  
    private static Scanner scanner = new Scanner(System.in);     
    private static int idCounter = 1; 
    

    public static void main(String[] args) 
    {
        boolean running = true;

        while (running) 
        {
            System.out.println("Todo List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Add Category");
            System.out.println("3. View Tasks");
            System.out.println("4. Filter Tasks by Category");
            System.out.println("5. Sort Tasks by Due Date");
            System.out.println("6. Change Task Status");
            System.out.println("7. Task Summary");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addTask();  
                    break;
                case 2:
                    addCategory();
                    break;
                case 3:
                    viewTasks(); 
                    break;
                case 4:
                    filterTasksByCategory();  
                    break;
                case 5:
                    sortTasksByDueDate();  
                    break;
                case 6:
                    changeTaskStatus();  
                    break;
                case 7:
                    taskManager.printTaskSummary(); 
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask() 
    {
        System.out.println("Enter task title:");
        String title = scanner.nextLine();

        System.out.println("Enter task description:");
        String description = scanner.nextLine();

        LocalDate dueDate = null;
        while (dueDate == null) 
        {
            System.out.println("Enter due date (YYYY-MM-DD):");
            String dateInput = scanner.nextLine();
                try {
                        dueDate = LocalDate.parse(dateInput);
                    } 
                catch (DateTimeParseException e)  
                    {
                        System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
                    }
        }
        

        System.out.println("Enter task category:");
        String category = scanner.nextLine();

        Task task = new Task(idCounter++, title, description, dueDate, category);  
        taskManager.addTask(task); 
        System.out.println("Task added.");
    }

    private static void addCategory() 
    {
        System.out.println("Enter category name:");
        String categoryName = scanner.nextLine();
        taskManager.addCategory(new Category(categoryName)); 
        System.out.println("Category added.");
    }

    private static void viewTasks() 
    {
        List<Task> tasks = taskManager.getTasksByCategory("All");
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks available.");
        } else 
        {
            tasks.forEach(System.out::println);
        }
    }

    private static void filterTasksByCategory() 
    {
        System.out.println("Enter category:");
        String category = scanner.nextLine();
        taskManager.getTasksByCategory(category).forEach(System.out::println);
    }

    private static void sortTasksByDueDate() 
    {
        taskManager.getTasksSortedByDueDate().forEach(System.out::println);  
    }

    private static void changeTaskStatus() 
    {
        System.out.println("Enter task title:");
        String title = scanner.nextLine();
    
        Task task = taskManager.getTasks().stream()
                .filter(t -> t.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    
        if (task != null) {
            System.out.println("Enter new status (NOT_STARTED, IN_PROGRESS, COMPLETED):");
            String statusStr = scanner.nextLine();
            try {
                TaskStatus status = TaskStatus.valueOf(statusStr.toUpperCase());
                task.setStatus(status);
                System.out.println("Task status updated to: " + status);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid status. Please enter one of: NOT_STARTED, IN_PROGRESS, COMPLETED.");
            }
        } 
        else 
        {
            System.out.println("Task not found. Please ensure the title is correct.");
        }
    }
}

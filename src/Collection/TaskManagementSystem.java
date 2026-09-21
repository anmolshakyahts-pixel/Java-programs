package Collection;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    public int taskId;
    public String taskName;
    public String description;
    public String priority;
    public String status;

    public Task(int taskId, String taskName, String description, String priority, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }
}

public class TaskManagementSystem {

    public static Task inputTask(Scanner scanner) {
        System.out.print("Enter Task ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Task Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter Priority (High/Medium/Low): ");
        String priority = scanner.nextLine();

        System.out.print("Enter Status (Pending/In Progress/Completed): ");
        String status = scanner.nextLine();

        return new Task(id, name, desc, priority, status);
    }

    public static void displayTask(Task t) {
        System.out.println("Task ID     : " + t.taskId);
        System.out.println("Task Name   : " + t.taskName);
        System.out.println("Description : " + t.description);
        System.out.println("Priority    : " + t.priority);
        System.out.println("Status      : " + t.status);
    }

    public static void displayAllTasks(ArrayList<Task> list) {
        if (list.isEmpty()) {
            System.out.println("No Tasks Found!");
        } else {
            System.out.println("\n--- All Tasks ---");
            for (Task t : list) {
                System.out.println("ID: " + t.taskId +
                        " | Name: " + t.taskName +
                        " | Priority: " + t.priority +
                        " | Status: " + t.status +
                        " | Description: " + t.description);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== TASK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Task");
            System.out.println("2. Display All Tasks");
            System.out.println("3. Search Task by ID");
            System.out.println("4. Update Task Status");
            System.out.println("5. Delete Task");
            System.out.println("6. Mark Task as Completed");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Task newTask = inputTask(scanner);
                    taskList.add(newTask);
                    System.out.println("Task Added Successfully!");
                    break;

                case 2:
                    displayAllTasks(taskList);
                    break;

                case 3:
                    System.out.print("Enter Task ID to Search: ");
                    int searchId = scanner.nextInt();
                    boolean foundSearch = false;

                    for (Task t : taskList) {
                        if (t.taskId == searchId) {
                            System.out.println("\nTask Found:");
                            displayTask(t);
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Task Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID to Update Status: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    boolean foundUpdate = false;

                    for (Task t : taskList) {
                        if (t.taskId == updateId) {
                            System.out.print("Enter New Status (Pending/In Progress/Completed): ");
                            t.status = scanner.nextLine();
                            System.out.println("Task Status Updated Successfully!");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Task Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Task ID to Delete: ");
                    int deleteId = scanner.nextInt();

                    boolean removed = taskList.removeIf(t -> t.taskId == deleteId);

                    if (removed) {
                        System.out.println("Task Deleted Successfully!");
                    } else {
                        System.out.println("Task Not Found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Task ID to Mark as Completed: ");
                    int completeId = scanner.nextInt();
                    boolean foundComplete = false;

                    for (Task t : taskList) {
                        if (t.taskId == completeId) {
                            t.status = "Completed";
                            System.out.println("Task Marked as Completed!");
                            foundComplete = true;
                            break;
                        }
                    }
                    if (!foundComplete) {
                        System.out.println("Task Not Found!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
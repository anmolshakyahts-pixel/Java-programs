package Collection;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public int rollNumber;
    public String name;
    public String course;
    public double marks;
    public String email;

    public Student(int rollNumber, String name, String course, double marks, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.email = email;
    }
}
public class StudentManagemntSystem {

    public static Student inputStudent(Scanner scanner) {
        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        return new Student(roll, name, course, marks, email);
    }

    public static void displayStudent(Student s) {
        System.out.println("Roll No : " + s.rollNumber);
        System.out.println("Name    : " + s.name);
        System.out.println("Course  : " + s.course);
        System.out.println("Marks   : " + s.marks);
        System.out.println("Email   : " + s.email);
    }

    public static void displayAllStudents(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("No Records Found!");
        } else {
            System.out.println("\n--- All Student Records ---");
            for (Student s : list) {
                System.out.println("Roll No: " + s.rollNumber +
                        " | Name: " + s.name +
                        " | Course: " + s.course +
                        " | Marks: " + s.marks +
                        " | Email: " + s.email);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by Roll Number");
            System.out.println("3. Update Student Details");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student newStudent = inputStudent(scanner);
                    studentList.add(newStudent);
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = scanner.nextInt();
                    boolean foundSearch = false;

                    for (Student s : studentList) {
                        if (s.rollNumber == searchRoll) {
                            System.out.println("Student Found:");
                            displayStudent(s);
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = scanner.nextInt();
                    boolean foundUpdate = false;

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).rollNumber == updateRoll) {
                            System.out.println("Enter New Details:");
                            Student updatedStudent = inputStudent(scanner);
                            studentList.set(i, updatedStudent);

                            System.out.println("Details Updated Successfully!");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = scanner.nextInt();

                    boolean removed = studentList.removeIf(s -> s.rollNumber == deleteRoll);

                    if (removed) {
                        System.out.println("Student Deleted Successfully!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 5:
                    displayAllStudents(studentList);
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
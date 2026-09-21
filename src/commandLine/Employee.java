package commandLine;
import java.util.Scanner;
public class Employee {
        String name;
        int age;
        double salary;

        public void getInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();
            System.out.print("Enter your Age: ");
            age = scanner.nextInt();
            System.out.print("Enter your Salary: ");
            salary = scanner.nextDouble();
        }

        public void display() {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Name   : " + name);
            System.out.println("Age    : " + age);
            System.out.println("Salary : " + salary);
        }
        public static void main(String[] args) {
            Employee o = new Employee();
            o.getInput();
            o.display();
        }
    }


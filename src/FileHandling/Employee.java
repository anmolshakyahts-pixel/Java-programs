package FileHandling;
import java.io.*;
import java.util.Scanner;

public class Employee implements Serializable {
    int empno;
    String name;
    String addresss;
    transient  Scanner r = new Scanner(System.in);

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpno() {
        return empno;
    }

    public String getAddresss() {
        return addresss;
    }

    public String getName() {
        return name;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        setEmpno(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        setName(sc.nextLine());
        System.out.print("Enter Employee Address: ");
        setAddresss(sc.nextLine());
    }
    public void display() {
        System.out.println("----- Employee Details -----");
        System.out.println("Employee Number : " + getEmpno());
        System.out.println("Employee Name   : " + getName());
        System.out.println("Employee Address: " + getAddresss());
        System.out.println("----------------------------");
    }
    public static void main(String[] args){
        Employee empWrite = new Employee();
        System.out.println("=== Enter Details ===");
        empWrite.input();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.dat"))) {
            oos.writeObject(empWrite);
            System.out.println("\nSuccessfully wrote object data to Employee.dat");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        System.out.println("\n=== Reading from File ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.dat"))) {
            Employee empRead = (Employee) ois.readObject();
            empRead.display();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

    }
    }


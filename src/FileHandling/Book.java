package FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String bname;
    private String aname;
    private double price;

    public Book(String bname, String aname, double price) {
        this.bname = bname;
        this.aname = aname;
        this.price = price;
    }

    public String getBname() {
        return bname;
    }

    public String getAname() {
        return aname;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Book: " + bname + " | Author: " + aname + " | Price: $" + price);
    }


    private static final String FILE_NAME = "Library.dat";

    public static void writeToFile(Book book) {
        List<Book> list = readFromFile(); // Get existing books
        list.add(book);                   // Add new book

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
            System.out.println("Book saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    public static List<Book> readFromFile() {
        List<Book> list = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return list;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (List<Book>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return list;
    }

    public static void searchFromFile(String searchName) {
        List<Book> list = readFromFile();
        boolean found = false;

        for (Book b : list) {
            if (b.getBname().equalsIgnoreCase(searchName)) {
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with name: " + searchName);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Store data to file");
            System.out.println("2) Read data from file");
            System.out.println("3) Search data from file");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String aname = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    writeToFile(new Book(bname, aname, price));
                    break;

                case 2:
                    System.out.println("\n--- All Books ---");
                    List<Book> books = readFromFile();
                    if (books.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String searchName = sc.nextLine();
                    searchFromFile(searchName);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        System.out.println("File location: " + new File(FILE_NAME).getAbsolutePath());

        sc.close();
    }
}

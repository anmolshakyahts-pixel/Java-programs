import java.util.Scanner;

public class Menu {
    int a;
    int b;
    int choice;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = r.nextInt();
        System.out.print("Enter number 2: ");
        b = r.nextInt();
    }
    void add(){
        int result = a + b;
        System.out.println("Sum: " + result);
    }
    void mult(){
        int result =a*b;
        System.out.println("Multiplication: " + result);
    }
    void subtract(){
        int result = a - b;
        System.out.println("subtract :" +result);
    }
    void menu(){
        Scanner c = new Scanner(System.in);
        choice = c.nextInt();
        switch (choice){
            case 1:
                getInput();
                add();
                break;
            case 2:
                getInput();
                subtract();
                break;
            case 3:
                getInput();
                mult();
                break;
            case 4:
                System.out.println("-----Exit-----");
                break;
            default:
                System.out.println("Invalid number! Choose the number according to the menu.");
                break;
        }
    }
    public static void main(String[] args){
        Menu o =new Menu();
        do{
            System.out.println( "1. Add");
            System.out.println( "2. Subtract");
            System.out.println( "3. Multiple");
            System.out.println( "4. Exit");
            System.out.print("Enter your choice : ");
            o.menu();
        }while (o.choice!=4);
    }
}

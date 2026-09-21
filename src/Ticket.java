import java.util.Scanner;
public class Ticket {
    void price(int age){
        if (age<0)
            System.out.print("Invalid age");
        else if(age<5)
            System.out.print("Free Ticket");
        else if(age>=5&&age<=18)
            System.out.print("Your Ticket price is ₹100" );
        else if(age>=19&&age<=60)
            System.out.print("Your Ticket price is ₹200" );
        else
            System.out.print("Your Ticket price is ₹150" );
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = r.nextInt();
        Ticket o = new Ticket();
        o.price(a);
    }
}

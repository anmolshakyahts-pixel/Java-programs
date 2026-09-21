package Payment;
import java.util.Scanner;
interface Payment{
     void makePayment(double amount);
}
class CreditCardPayment implements Payment{

    @Override
     public void makePayment(double amount) {
        System.out.println("Payment of ₹amount made using Credit Card: "+ amount);
    }
}
class UPIPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹amount made using Credit Card: "+ amount);
    }
}
public class Pay {
    public static void main(String[] args){
       Payment c = new CreditCardPayment();
        Payment u = new UPIPayment();
        Scanner r =new Scanner(System.in);
        System.out.println("1.CreditCardPayment");
        System.out.println("2.UPIPayment ");
        System.out.println("3. Exit/ Any other Number except 1 or 2 ");
        System.out.print("Enter your Choose: ");
        int  b = r.nextInt();
        System.out.print("Enter the amount: ");
        double a = r.nextDouble();
        if(b==1) {
            c.makePayment(a);
        } else if (b ==2) {
           u.makePayment(a);
        }else
            System.out.println("---Exit---");

        r.close();

    }
}

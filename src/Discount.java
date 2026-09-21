import java.util.Scanner;
public class Discount {
    float discount(float amount){
        if(amount>5000)
            return amount-amount*((float)20/100);
       else if (amount>=2000&&amount<=5000)
           return amount-amount*((float)10/100);
       else
           return amount;
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the a purchase amount: ");
        float x = r.nextFloat();
        Discount o = new Discount();
        float y = o.discount(x);
        System.out.print("Final payable amount: " + y);
    }
}

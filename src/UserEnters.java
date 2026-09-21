import java.util.Scanner;
public class UserEnters {
    String match(int pin){
        if (pin==1234)
            return "PIN is correct";
        else
            return "Pin is Incorrect";
    }
    String withdrawal(int balance , int withdrawalAmount){
         if(withdrawalAmount>balance)
             return "Transaction Failed: Insufficient balance";
         else if ((balance-withdrawalAmount)<1000) {
             int Allowed = balance - 1000;
             if (Allowed < 0)
                 Allowed = 0;
             return "Transaction Failed: Balance after withdrawal must be at least ₹1000. You can only withdraw maximum: ₹" + Allowed;
         }
         else{
             int remainingBalance = balance -withdrawalAmount;
             return "Transaction Successful! Remaining balance : ₹" +remainingBalance;
         }
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        UserEnters o = new UserEnters();
        System.out.print("Enter PIN : ");
        int pin = r.nextInt();
        String pinStatus = o.match(pin);
        System.out.println(pinStatus);
        if(pinStatus.equals("PIN is correct")){
            System.out.print("Enter Balance: ");
            int balance = r.nextInt();
            System.out.print("Enter Withdrawal Amount: ");
            int withdrawalAmount= r.nextInt();
            String result = o.withdrawal(balance,withdrawalAmount);
            System.out.print(result);
        }
    }
}

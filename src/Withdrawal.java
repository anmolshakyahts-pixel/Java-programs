import java.util.Scanner;
public class Withdrawal {

    String withdrawal( int x , int y){
        if(x>= y)
            return " withdrawal is possible";
        else
            return "withdrawal is not possible";
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println(" Enter you account balance and withdrawal amount: ");
        int balance = r.nextInt();
        int withdrawal= r.nextInt();
        Withdrawal z = new Withdrawal();
        String a = z.withdrawal(balance,withdrawal);
        System.out.println(a);

    }

}

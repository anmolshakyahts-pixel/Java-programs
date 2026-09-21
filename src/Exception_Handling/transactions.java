package Exception_Handling;

import java.util.Scanner;

public class transactions {
    static int balance = 0;
    Scanner r = new Scanner(System.in);

    void input(int n) {



        System.out.print("DEPOSIT: " );
        int deposit = r.nextInt();

        balance = deposit;
        do {
            try {
                for (int i = n; i > 0; i--) {
                    System.out.print("WITHDRAW: " );
                    int Withdraw = r.nextInt();


                    Exception exception = new Exception();
                    if (Withdraw > balance)
                        throw exception;
                     balance = balance -Withdraw;

                }
                n--;
            } catch (Exception t) {
                System.out.println("Transaction Failed");
            }
        }
        while (n == 0);


    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        transactions o = new transactions();
        System.out.print("Input: ");
        int z = r.nextInt();

        o.input(z);

    }
}

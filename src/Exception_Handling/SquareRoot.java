package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    void sqrRoot(){
        try{
            Scanner r = new Scanner(System.in);
            System.out.print("enter the number: ");
            int a= r.nextInt();
            double res = Math.sqrt(a);
            System.out.println("Square root:"+ res);
        }catch (InputMismatchException e){
            System.out.println("Do not enter non integer value");
        }

    }
    public static void main(String[] args){
        SquareRoot o = new SquareRoot();
        o.sqrRoot();
    }
}

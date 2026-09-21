package Exception_Handling;

import java.util.Scanner;

public class InputSafeCalculator {
    static String calculateRatio(String num1Str, String num2Str){
        try{
            int a = Integer.parseInt(num1Str);
            int b = Integer.parseInt(num2Str);
            int c = a/b;
            String res = String.valueOf(c);
            return ("Answer: "+ res);
        }catch (NumberFormatException r){
            return ("Error: Invalid  operation.");

        }catch (ArithmeticException r ){
            return ("Error: Invalid  operation.");
        }
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter 2 number: ");
        String a = r.nextLine();
        String b = r.nextLine();
        String c =calculateRatio(a,b);
        System.out.println(c);
    }
}

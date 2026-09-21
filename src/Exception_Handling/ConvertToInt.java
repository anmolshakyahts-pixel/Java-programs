package Exception_Handling;

import java.util.Scanner;

public class ConvertToInt {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
       try{ String i = r.nextLine();
        int a = Integer.parseInt(i);
           System.out.println(i);

       }catch (NumberFormatException i){
           System.out.println("Do not enter non integer value ");
       }
    }
}

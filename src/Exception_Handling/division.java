package Exception_Handling;
import java.util.Scanner;
public class division {

    int divi(int a , int b){
        int result = a/b;
        return result;

    }
    void display(){
        Scanner r =  new Scanner(System.in);
        try{
            System.out.println("Enter 2 numbers: ");
            int x = r.nextInt();
            int y = r.nextInt();
            int res = divi(x,y);
            System.out.println(""+res);

        } catch (ArithmeticException t){
            System.out.println("Division by zero is not allowed");
        }

    }
    public static void main(String[] args){
        division o = new division();

       o.display();
    }
}

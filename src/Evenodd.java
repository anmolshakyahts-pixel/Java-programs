import java.util.Scanner;
public class Evenodd {
    String evenodd(int a){
        if( a%2==0)
            return "Number is even";
        else
            return "Number is odd";
    }
    public static void main(String[]args){
        Scanner r = new Scanner(System.in);
        System.out.println("Write you number to check EvenOdd :");
        int y = r.nextInt();
        Evenodd e = new Evenodd();
        String x = e.evenodd(y);
        System.out.println(x);
    }
}

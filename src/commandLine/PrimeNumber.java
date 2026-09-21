package commandLine;
import java.util.Scanner;
public class PrimeNumber {
    int number;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = r.nextInt();
    }
    String prime(int x){
        if(x<=1)
            return " is not a prime number ";
        for(int i =2; i<Math.sqrt(x);i++){
            if(x%i==0)
                return "Not a prime number";
        }
        return "prime number";
    }
    public static void main(String[] args){
        PrimeNumber o = new PrimeNumber();
        o.getInput();
        String result = o.prime(o.number);
        System.out.println(result);
    }
}

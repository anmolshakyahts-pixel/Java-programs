import java.util.Scanner;
public class Reverse {
    int number;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        number = r.nextInt();
    }
    int reverse(int x){
        int z =0;
       while(x!=0){
           int lastdigit = x%10;
           z = z*10 + lastdigit;
           x = x/10;
       }
        return z;
    }
    public static void main(String[] args){
        Reverse o = new Reverse();
        o.getInput();
        int result = o.reverse(o.number);
        System.out.print("Reversed Integer value : " + result);
    }
}

import java.util.Scanner;
public class Largest {
    int largest(int a , int b){
        if (a>b)
            return a;
        else
            return b;
                 }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int x = r.nextInt();
        int y = r.nextInt();
        Largest z = new Largest();
        int v = z.largest(x,y);
        System.out.println("Largest number is :" + v);
    }
    }

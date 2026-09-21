import java.util.Scanner;
public class ThreelargestNumber {
    int a ;
    int b;
    int c;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = r.nextInt();
        b = r.nextInt();;
        c = r.nextInt();
    }
    void largestNumber(){
        if (a>b&&a>c){
            System.out.println("Largest number is "+ a);
        }
        else if(b>a&&b>c){
            System.out.println("Largest number is "+ b);
        }
        else {
            System.out.println("Largest number is "+ c);
        }
        }
        public static void main(String[] args){
        ThreelargestNumber o = new ThreelargestNumber();
        o.getInput();
        o.largestNumber();
    }
}

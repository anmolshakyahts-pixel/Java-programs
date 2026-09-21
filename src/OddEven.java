import java.util.Scanner;

public class OddEven {
    int number;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        number = r.nextInt();
    }
    void   oddeven(){
        int temp = Math.abs(number);
        int even = 0;
        int odd = 0;
        while (temp>0){
            int last = temp%10;
            if(last%2==0){
                even += last;}
            else
                odd += last;
            temp/=10;
            }
        System.out.println("sum of even number: " +even);
        System.out.println("Sum of odd number:" +odd);
        }
        public static void main(String[] args){
        OddEven o = new OddEven();
        o.getInput();
        o.oddeven();
        }
    }

import java.util.Scanner;
public class LeapYear {

    String leapyear(int year) {

        if((year%4== 0 && year%100!=0)||(year%400==0))
            return "it is a leap year";
        else
            return "it is not a leap year";
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int x = r.nextInt();
        LeapYear f = new LeapYear();
        String z = f.leapyear(x);
        System.out.println(z);
    }

}

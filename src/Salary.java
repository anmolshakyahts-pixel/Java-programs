import java.util.Scanner;
public class Salary {
    float salary(int experience,float sal){
        if(experience<2)
            return sal;
        else if(experience>=2&&experience<=5)
            return sal*((float)10/100)+sal;
        else
            return sal*((float)20/100)+sal;
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter your experience: " );
        int a = r.nextInt();
        System.out.print("Enter your Salary: ₹" );
        float x = r.nextFloat();
        Salary o = new Salary();
        float sal = o.salary(a,x);
        System.out.print("your Salary is ₹"+sal);
    }
}

import java.util.Scanner;
public class TotalBill {
    float totalbill(float units){
        if(units<=100)
            return units*5;
        else if (units<=300)
            return ((100*5)+((units-100)*7));
        else
            return ((100*5)+(200*7)+((units-300)*10));
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the Units : ");
        float unit = r.nextFloat();
        TotalBill o = new TotalBill();
        float a = o.totalbill(unit);
        System.out.println("Total Bill: "+ a);
    }

}

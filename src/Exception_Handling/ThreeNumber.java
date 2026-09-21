package Exception_Handling;

import java.util.Scanner;

class MyException extends Exception{
    MyException(){

    }

}
public class ThreeNumber {
    void threenum(int x , int y , int z)  {
        try {
            if (x < 10 || y < 10 || z < 10)
                throw new MyException();
            int res = x+y+z;
            System.out.println("Sum: "+res);
        }catch (Exception r){
            System.out.println("Number is less than 10");
        }

    }
    public static void main(String[] args){
        ThreeNumber o = new ThreeNumber();
        Scanner r = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int x = r.nextInt();
        int y = r.nextInt();
        int z = r.nextInt();
        o.threenum(x, y,z);
    }
}

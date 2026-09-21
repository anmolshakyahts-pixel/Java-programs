package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerArray {
    int n;
    void average(int n){
        Scanner r = new Scanner(System.in);
       try{ int res = 0;
       int[] arry = new int[this.n];
       for(int i = 0; i< this.n; i++){
           arry[i] =  r .nextInt();
           res+= arry[i];
       }
       System.out.println("Average : " + res/ this.n);}
       catch (InputMismatchException e){
           System.out.println("Do not enter non integer value");
       }
    }public static void main(String[] args){
        IntegerArray o = new IntegerArray();
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        o.n = i.nextInt();
        System.out.println("Enter the value inside array: ");
        o.average(o.n);
    }
}

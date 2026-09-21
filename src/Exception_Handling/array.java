package Exception_Handling;

import java.util.Scanner;

public class array {
    int array[] ;
    Scanner r = new Scanner(System.in);

    void arry(int n ){
        try{
        array = new int [n];
        System.out.println("Size of an array: "+n);
        System.out.print("Enter the value inside the array :");
       for(int i =0 ; i<n;i++){
           int a = r.nextInt();
           array[i] = a;
       }}catch(NegativeArraySizeException | NullPointerException t){
            System.out.println("zero and negative value can not enter");
        }
    }
    void display() {
        System.out.println("Array index :");
        int res = r.nextInt();
            try {

                System.out.println( array[res]);
            } catch (IndexOutOfBoundsException r) {
                System.out.println("Index out of bounds");
            }
        }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
       array o = new array();
       int c =r.nextInt();
       o.arry(c);
       o.display();

    }
    }


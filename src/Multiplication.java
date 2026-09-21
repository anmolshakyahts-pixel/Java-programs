import java.util.Scanner;
public class Multiplication {
    int number;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = r.nextInt();
    }
    void multiplicationTable(){
        int a=0;
        for(int i = 1; i<=10;i++){
            a = number*i;
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        Multiplication o =new Multiplication();
        o.getInput();
        System.out.println("you Table of number "+ o.number + " is here:");
        o.multiplicationTable();
    }
}
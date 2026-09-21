import java.util.Scanner;
public class Student {
    String result(int sub1, int sub2, int sub3){
        if(sub1>=35&&sub2>=35&&sub3>=35)
            return "Pass";
        else
            return "Fail";
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter 1 subject Marks: ");
        int a = r.nextInt();
        System.out.print("Enter 2 subject Marks: ");
        int b = r.nextInt();
        System.out.print("Enter 3 subject Marks: ");
        int c = r.nextInt();
        Student o = new Student();
        String x = o.result(a,b,c);
        System.out.print(x);
    }
}

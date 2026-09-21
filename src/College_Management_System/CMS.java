package College_Management_System;
import java.util.Scanner;
 class Teacher {
    String Name;
    String Qualification;
}
interface college {
     String College_name ="CDAC";
     void getDetails();
    void showDetails();
    default String show() {
        return "Welcome to "+College_name;
    }
    static void staticmessage() {
        System.out.println("General message2");
    }
}
    class department extends Teacher implements college
{
    int dept_no;
    String Dept_Name;

    @Override
    public void getDetails() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        Name = r.nextLine();
        System.out.print("Enter your Qualification: ");
        Qualification = r.nextLine();
        System.out.print("Enter Dept name: ");
        Dept_Name = r.nextLine();
        if(Dept_Name.equalsIgnoreCase("IT dept"))
            dept_no = 10;
        else if(Dept_Name.equalsIgnoreCase("Management dept"))
            dept_no = 20;
        else{
            System.out.println("not a valid Record");
            System.exit(0);
        }

    }
    @Override
    public void showDetails() {

        System.out.println("Name: " +Name);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Dept_Name: " +Dept_Name);
        System.out.println("dept_no: "+dept_no);
    }
}
public class CMS{
    public static void main(String[] args){
        college.staticmessage();
        department d = new department();
       String a = d.show();
        System.out.println(a);
        d.getDetails();
        d.showDetails();

    }
}
import java.util.Scanner;
public class Grade {

    String grade(float x){

            if(x>=90)
                return "A";
            else if (x>=75)
                return "B";
            else if (x>=50)
                return "c";
            else
                return "Fail";

    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        float marks = r.nextFloat();
        Grade f = new Grade();
        String a = f.grade(marks);
        System.out.println("Grade : " + a );

    }
}

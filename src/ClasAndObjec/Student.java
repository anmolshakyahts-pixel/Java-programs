package ClasAndObjec;
import java.util.Scanner;
public class Student {
    String name;
    int id;
    double grade;
    Student(){

    }
    Student(String name,int id, double grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    void displays(Student[]studentArray){
        for (int i =0; i<studentArray.length;i++){
            System.out.println("Name : " + studentArray[i].name);
            System.out.println("id : " + studentArray[i].id);
            System.out.println("grade: " + studentArray[i].grade);
        }
    }
    void sortStudents(Student[]studentArray){

        for (int i = 0 ; i<studentArray.length-1;i++){
            for(int j = 0 ; j<studentArray.length-1-i;j++){
                if (studentArray[j].grade > studentArray[j+1].grade) {
                    Student temp = studentArray[j];
                    studentArray[j] = studentArray[j+1];
                    studentArray[j+1] = temp;

                }
            }
        }
    }
    public static void main(String[] args){
      Student[] studentArray = new Student[10];
      Scanner r = new Scanner(System.in);
      for(int i =0; i< 10;i++){
          System.out.print("Enter your name: ");
          String a = r.next();
          System.out.print("Enter your Id: ");
          int b = r.nextInt();
          System.out.print("Enter your grade: ");
          double c = r.nextDouble();
          studentArray[i] = new Student(a,b,c);
      }
      Student i = new Student();
      System.out.println("Display student details : ");
      i.displays(studentArray);
      i.sortStudents(studentArray);
      System.out.println("sort the student detail based on grade: ");
      i.displays(studentArray);
    }
}

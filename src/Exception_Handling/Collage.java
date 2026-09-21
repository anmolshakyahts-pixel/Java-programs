package Exception_Handling;

interface Admission {
    void registration();
}
class Student {

    public void Addstudent() {
        class MtechStudent implements Admission {
            @Override
            public void registration() {
                System.out.println("Registration successful for M.Tech Student (Local Inner Class).");
            }
        }
        MtechStudent mtech = new MtechStudent();
        mtech.registration();


        Admission anonymousStudent = new Admission() {
            @Override
            public void registration() {
                System.out.println("Registration successful for Anonymous Student (Anonymous Class).");
            }
        };
        anonymousStudent.registration();
    }
}

public class Collage {
    public static void main(String[] args) {
        Student student = new Student();
        student.Addstudent();
    }
}


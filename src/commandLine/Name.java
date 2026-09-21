package commandLine;
import java.util.Scanner;
public class Name {
    String name[] = new String[5];
    void getInput(){
        Scanner r = new Scanner(System.in);
        for(int i =0; i<5; i++){
            System.out.println("Enter the name: ");
            name[i]=r.nextLine();
        }
    }
    void display(){
        for(int i = 0;i<5;i++){
            System.out.println(name[i]);
        }
    }
    public static void main(String[] args){
        Name o = new Name();
        o.getInput();
        o.display();
    }
}

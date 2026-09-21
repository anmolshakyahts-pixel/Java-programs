package commandLine;
import java.util.Scanner;
public class FirstCapitalLetter {
    String name[] = new String[5];
    void getInput() {
        Scanner r = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name: ");
            name[i] = r.nextLine();
        }
    }
    void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }
    }
    void firstCaptial() {
        for (int i = 0; i < 5; i++) {
            char ch[] = name[i].toCharArray();
            if (ch.length > 0 && ch[0] >= 'a' && ch[0] <= 'z') {
                ch[0] = (char) (ch[0] - 32);
            }
            name[i] = new String(ch);
        }
    }
    public static void main(String[] args){
        FirstCapitalLetter o = new FirstCapitalLetter();
        o.getInput();
        o.firstCaptial();
        System.out.println(" Name :");
        o.display();
    }
}

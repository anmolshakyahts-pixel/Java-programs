package commandLine;
import java.util.Scanner;
public class StringLenghtChecker {

    String userInput;
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        userInput = scanner.nextLine();
    }
    public void countLength() {
        int length = 0;
        char[] charArray = userInput.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            length++;
        }
        System.out.println("The length of the string is: " + length);
    }
    public static void main(String[] args) {

        StringLenghtChecker o = new StringLenghtChecker();
        o.getInput();
        o.countLength();
    }
}
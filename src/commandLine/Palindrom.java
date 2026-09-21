package commandLine;
import java.util.Scanner;
public class Palindrom {
    String name1;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter  the name: ");
        name1 = r.nextLine();
    }
    String palendrom(String x){

        int frist = 0;
        int last = x.length()-1;
        while (frist<last){
            if(x.charAt(frist)!=x.charAt(last)){
                return "Not Palindrome";
            }
            frist++;
            last--;
        }
        return "Palindrome";
    }
    public static void main(String[] args){
        Palindrom o = new Palindrom();
        o.getInput();
        String result = o.palendrom(o.name1.toLowerCase());
        System.out.println(result);
    }
}

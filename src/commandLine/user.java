package commandLine;
import java.util.Scanner;
public class user {
    String x ;
    void getInput(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the name: ");
        x = r.next();
    }
    void upperCase(){
        String y =" ";
        for(int i = 0;i < x.length(); i++){
           char ch = x.charAt(i);
           if(ch>='a'&&ch<='z')
               y+=(char)(ch -32);
           else
               y+= ch;
        }
        System.out.println("Upper case : "+y);
    }
    public static void main(String[] args){
        user o = new user();
        o.getInput();
        o.upperCase();
    }
}

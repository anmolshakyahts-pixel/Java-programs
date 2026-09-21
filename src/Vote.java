import java.util.Scanner;
public class Vote {
    String vote(int a){
        if (a>= 18)
            return "ELIGIBLE TO VOTE";
        else
            return "NOT ELIGIBLE";
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int x = r.nextInt();
        Vote v = new Vote();
        String y = v.vote(x);
        System.out.println(y);
    }
}

package Test;

import java.util.Scanner;
public class digit {
    void digit(int x) {
        int b = x;
        int last = 0;
        int result = 0;
        int a =x;
        for (int i = 0; i < 3; i++) {
            last = a % 10;
            result += last * last * last;
            a = a/10;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int a =  r.nextInt();
        digit o = new digit();
        o.digit(a);
    }
}


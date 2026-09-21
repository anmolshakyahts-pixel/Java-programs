import java.util.Scanner;
public class Login {
    void login(String Username , int Password) {
        if (Username.equals("admin") && Password == 1234)
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Username or Password");

    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Username: ");
        String username = r.nextLine();
        System.out.print("Password: ");
        int password = r.nextInt();
        Login o = new Login();
        o.login(username,password);
    }
}

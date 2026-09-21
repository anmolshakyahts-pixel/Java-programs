package Exception_Handling;

public class SecurityManager {
    static void checkPassword(String password)throws Exception{
        if(password.equals(null)||password.equals(0))
            throw new Exception("Authentication failure: Password cannot be empty.");
        else System.out.println("Password check successful.");
    }
    static void processData(String password){
        try{
            checkPassword(password);
            System.out.println("Data successfully processed");
        }catch (Exception r){
            System.out.println(r);
        }

    }
    public static void main(String[] args){
        processData("secret");
        processData(null);
    }
}

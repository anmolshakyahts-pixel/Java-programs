package Exception_Handling;
import java.util.Scanner;

class InvalidQuantityException extends Exception{
    InvalidQuantityException(){
            System.out.println("InvalidQuantityException") ;
    }
 }
 class InvalidPriceException extends Exception{
    InvalidPriceException(){
        System.out.println("InvalidPriceException");
    }
 }
public class ShoppingCart {
    void totalBill(int x , int y){
        try{
            if(x <=0)
                throw new InvalidQuantityException();
        }catch (InvalidQuantityException  e)  {
            System.out.println("Do not enter 0 or negative value "+e);
        }
        try {
            if(y<=0)
                throw new InvalidPriceException();
        }catch (InvalidPriceException i){
            System.out.println("Do not enter 0 or negative value "+i);
        }
        float reslt = x*y;
        if(reslt>5000){
            reslt =  (reslt - reslt*((float)10/100));
        }
        System.out.print("Total bill: "+reslt);
    }
 public static void main(String[] args){
     Scanner r = new Scanner(System.in);
     System.out.print("Enter the Product Price: ");

     int Product_price = r.nextInt();
     System.out.print("Enter the Quantity: ");

     int Quantity = r.nextInt();
     ShoppingCart o = new ShoppingCart();
     o.totalBill(Quantity,Product_price);
 }
}

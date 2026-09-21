package Inventory_Management_System;
import java.util.Scanner;
public class Product {
    String Pname;
    float Price;
    int qty;
    String Description;

    void getProduct(){
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the Product name: ");
        Pname = r.nextLine();
        System.out.println("Enter the Description of teh Product : ");
        Description = r.nextLine();
        System.out.print("Enter the Price of Product : ");
        Price =r.nextFloat();
        System.out.print("Enter the Qty of the Product : ");
        qty = r.nextInt();
    }
    void displayProduct(){
        System.out.println("Product Name: "+ Pname);
        System.out.println("Price "+ Price);
        System.out.println("Qty "+ qty);
        System.out.println("Description"+ Description);
    }
    void calculateDiscount(){
        float price1 = Price*qty ;
        if (price1> 2000){
            float a = price1 - price1*((float) 10 /100);
            System.out.print("your total price: "+a);
        }
        else {
            float a = price1 - price1*((float) 5/100);
            System.out.print("your total price: "+a);
        }



    }


}

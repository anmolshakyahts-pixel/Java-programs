package Inheritance_lab2;

import java.util.Scanner;

class Order{
    private String customerName;
    private int customerNumber;
   private double orderQuantity;
    private double unitCost;
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber){
        this.customerNumber =customerNumber;
    }

    public double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    public int computePrice( ){
        double res = orderQuantity * unitCost;
        return (int) res;

    }
}

class ShippedOrder extends Order{
    private int i = 40;

    @Override
    public int computePrice() {
        double result =  getOrderQuantity()*getUnitCost()+i;
        return (int) result;
    }
}
class UserOrder{
    public static void main(String[] args){
        Order r = new ShippedOrder();
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = i.nextLine();
        r.setCustomerName(name);
        System.out.print("Enter the mobile number: ");
        int number = i.nextInt();
        r.setCustomerNumber(number);
        System.out.print("Enter the order Quantity: ");
        double qty = i.nextDouble();
        r.setOrderQuantity(qty);
        System.out.print("Enter the unit Cost: ");
        double cost = i.nextDouble();
        r.setUnitCost(cost);
        System.out.println("Name: "+ r.getCustomerName());
        System.out.println("Mobile number: "+r.getCustomerNumber());
        System.out.println("Order Quantity: "+r.getOrderQuantity());
        System.out.println("Unit Cost: "+ r.getUnitCost());
        int result = r.computePrice();
        System.out.println("Total Cost: "+result);
    }
}
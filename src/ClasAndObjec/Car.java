package ClasAndObjec;

public class Car {
    String make;
    String model;
    int year ;
    String color ;
    Car(){
        make= "Alloy";
         model= "Maruti Suzuki";
         year =  2018 ;
         color = "Black";
    }
    Car(String make, String model, int year, String color){

        this.make = make;
        this.model =model;
        this.year = year;
        this.color = color;

    }
    void display(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(color);
    }
    public static void main(String[] args){
        Car i = new Car();
        System.out.println("Default Constructor: ");
        i.display();
        Car v = new Car("iron","BMW",2016,"White");
        System.out.println("Parameterized Constructor: ");
        v.display();
    }
}

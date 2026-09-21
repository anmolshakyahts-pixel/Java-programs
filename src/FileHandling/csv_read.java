package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
public class csv_read {

    void read()  {
        try(Scanner r = new Scanner(new File("C:\\Users\\anmol\\Downloads\\industry.csv"))){
        while (r.hasNextLine()) {
            String i = r.nextLine();
            String[] name = i.split(",");
            for (String z : name) {
                System.out.println(z.trim() + " | ");
            }
        }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        }public static void main(String[] args){
        csv_read o = new csv_read();
        o.read();
    }


}

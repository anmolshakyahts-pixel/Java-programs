package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyContent {
    char k[]= new char [100];
    void getRead(){
            try{
                FileReader r = new FileReader("C:\\Users\\anmol\\IdeaProjects\\cdac ac\\src\\FileHandling\\text.txt" );
                r.read(k);
                System.out.println(k);
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
    }
    void  getWrite(){

        try{
            FileWriter w =new FileWriter("C:\\Users\\anmol\\IdeaProjects\\cdac ac\\src\\FileHandling\\text1.txt");
            w.write(k);
            System.out.println("Copy content is successful");
           w.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        CopyContent o = new CopyContent();
        o.getRead();
        o.getWrite();
    }
}

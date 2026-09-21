package FileHandling;

import java.io.*;

public class CountVowels {
    char k[]= new char [100];
    void read()  {
      try{  FileReader r = new FileReader("C:\\Users\\anmol\\IdeaProjects\\cdac ac\\src\\FileHandling\\text.txt" );
        r.read(k);
      System.out.println(k);} catch (IOException e){
          System.out.println(e);
      }

    }void vowel() {

            int count = 0;

            for (char c : k) {
                if (c == 'a' ||c == 'A'|| c=='E'|| c == 'e' ||c=='I'|| c == 'i'||c =='O' || c == 'o'||c =='U' || c == 'u') {
                    count++;
                }
            }
            System.out.println("The number of vowels:" +count);
        }

    public static void main(String[] args){
        CountVowels o = new CountVowels();
        o.read();
        o.vowel();
    }

}

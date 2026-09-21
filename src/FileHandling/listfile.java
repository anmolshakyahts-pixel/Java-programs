package FileHandling;

import java.io.File;
import java.util.HashMap;

public class listfile {
    void list() {
        File folder = new File("C:\\Users\\anmol\\Downloads");

        File[] files = folder.listFiles();
        HashMap<Integer,String> fil = new HashMap<>();
        for(int i = 0;i<files.length;i++){
            fil.put(i,files[i].getName());
        }
        System.out.println(fil);
    }
    public static void main(String[] args){
        listfile o = new listfile();
        o.list();


    }
}


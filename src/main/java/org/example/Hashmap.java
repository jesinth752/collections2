package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class Hashmap {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        HashMap<Integer,String> studentdatabase= new HashMap<Integer,String>();
        int n;

        String name;
        int id;
        log.info("Enter no of Records");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            log.info("Enter ID:");
            id=input.nextInt();

            log.info("Enter Name");
            name= input.next();
            studentdatabase.put(id,name);
        }
        String ret="HashMap:"+sudentdatabase;
        log.info(ret);
        log.info("Enter key to delete");
        int k=input.nextInt();
        studentdatabase.remove(k);
        String ar="After removing"+studentdatabase;
        log.info(ar);
        String sz="Size:"+studentdatabase.size();
        log.info(sz);
        log.info("Printing all keys in Hashmap");
        for (Integer x : studentdatabase.keySet()) {
            String tyc=String.valueOf(x);
            log.info(tyc);
        }

        log.info("Printing all vaules in Hashmap");
        for (String y: studentdatabase.values()) {
            log.info(y);
        }
        log.info("Printing all keys with vaules");
        for (Integer z : studentdatabase.keySet()) {
            String z1="key: " + z + " value: " + studentdatabase.get(z);
            log.info(z1);
        }
        StudentDatabase.clear();
        String clr="After clearing "+StudentDatabase;
        log.info(clr);

    }
}

package org.example;

import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
            TreeSet<String> crplayerset = new TreeSet<String>();
            crplayerset.add("Sachin");
            crplayerset.add("Zahir");
            crplayerset.add("Mahi");
            crplayerset.add("Bhajji");
            crplayerset.add("Viru");
            crplayerset.add("Gautam");
            crplayerset.add("Ishant");
            crplayerset.add("Umesh");
            crplayerset.add("Pathan");
            crplayerset.add("Virat");
            String os="Original Set:" + crplayerset;
            log.info(os);
            String fs="First Name: "+ crplayerset.first();
            log.info(fs);
            String ls="Last Name: "+ crplayerset.last();
            log.info(ls);
            TreeSet<String> newplyset = (TreeSet<String>) crplayerset.subSet("Mahi", "Virat");
            String ss="Sub Set: "+ newplyset;
            log.info(ss);
    }
}

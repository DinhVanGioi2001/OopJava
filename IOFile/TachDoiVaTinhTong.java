package OopJava.IOFile;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class TachDoiVaTinhTong {
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String s = "";
        while(sc.hasNext()){
            s = sc.next();
            while(s.length() > 1){
                BigInteger a = new BigInteger(s.substring(0, s.length()/2));
                BigInteger b = new BigInteger(s.substring(s.length()/2));
                BigInteger c = a.add(b);
                s = c.toString();
                System.out.println(s);
            }
            
        }
    }
}

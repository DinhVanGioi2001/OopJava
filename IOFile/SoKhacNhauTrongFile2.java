package OopJava.IOFile;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream din = new DataInputStream(new FileInputStream("DATA.in"));
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            for(int i = 0; i < 100000; i++){
                int tmp = din.readInt();
                if(tm.containsKey(tmp)){
                    tm.put(tmp, tm.get(tmp) + 1);
                }else{
                    tm.put(tmp, 1);
                }
            }
            for(Integer i: tm.keySet()){
                System.out.println(i + " " + tm.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}

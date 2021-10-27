package OopJava.IOFile;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.FileNotFoundException;

public class SoKhacNhauTrongFile1 {
    public static void main(String[] args){
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            while(sc.hasNext()){
                int n = Integer.parseInt(sc.next());
                if(tm.containsKey(n)){
                    tm.put(n, tm.get(n) + 1);
                }else{
                    tm.put(n, 1);
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

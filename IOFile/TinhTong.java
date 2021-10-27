package OopJava.IOFile;

import java.io.*;
import java.util.*;

public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        long sum = 0;
        while(sc.hasNextLine()){
            String[] arr = sc.nextLine().split("\\D+");
            for(String i: arr){
                if(i.length() > 10){
                    continue;
                }else{
                    if(!i.equals(""))
                        sum += Integer.parseInt(i);
                }
            }
        }
        System.out.println(sum);
    }
}

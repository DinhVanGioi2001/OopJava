/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.SetAndMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TimTuThuanNghichDaiNhat {
    public static void main(String[] args) throws FileNotFoundException {
//        File f = new File("SV.in");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        TreeMap<String, Integer> tm = new TreeMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            StringBuilder s2 = new StringBuilder(s);
            if(tm.containsKey(s)){
                tm.put(s, tm.get(s) + 1);
            }else{
                String s3 = s2.reverse().toString();
                if(s.equals(s3)){
                    tm.put(s, 1);
                    list.add(s);
                }
            }
        }
        // dao nguoc thu tu cua 1 bo so sanh
        // vd foo, test, a => test, foo, a
        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        int maxLen = list.get(0).length();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() == maxLen)
                System.out.println(list.get(i) + " " + tm.get(list.get(i)));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class SoThuanNghichTrongFile{
    
    public static boolean stn(int n){
        String s = "" + n; 
        int m = s.length();
        if(n % 2 == 0 || m % 2 == 0 || m <= 1) return false;
        for(int i = 0; i <= s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length() - i - 1) || (int)s.charAt(i) % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)ois.readObject();
        
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>)ois.readObject();
        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int n = 1;
        for(Integer i: list1){
            if(list2.contains(i) && i % 2 == 1){
                if(tm.containsKey(i)){
                    tm.put(i, tm.get(i));
                }else{
                    if(n <= 10 && stn(i)){
                        tm.put(i, 1);
                        n++;
                    }
                }
            }
        }
        for(Integer i: tm.keySet()){
            System.out.println(i + " " + tm.get(i));
        }
    }
}

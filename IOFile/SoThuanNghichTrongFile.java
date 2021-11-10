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
        ObjectInputStream din = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)din.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        din = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>)din.readObject();
        int n = 1;
        for(Integer i: list1){
            if(tm.containsKey(i)){
                tm.put(i, tm.get(i) + 1);
            }else{
                if(n <= 10 && list2.contains(i) && stn(n)){
                    tm.put(i, 1);
                    n++;
                }
            }
        }
        for(Integer i: tm.keySet()){
            System.out.println(i + " " + tm.get(i));
        }
    }
}

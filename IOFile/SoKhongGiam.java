/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.*;
import java.util.*;

/**
 *
 * @author Viet Anh
 */
public class SoKhongGiam {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)ois.readObject();
        TreeMap<Integer, Integer> hm1 = new TreeMap<>();
        for(Integer i: list1){
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i) + 1);
            }else{
                if(check(i) == 1){
                    hm1.put(i, 1);
                }
            }
        }
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        list1 = (ArrayList<Integer>)ois.readObject();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(Integer i: list1){
            if(hm2.containsKey(i)){
                hm2.put(i, hm2.get(i) + 1);
            }else{
                if(check(i) == 1){
                    hm2.put(i, 1);
                }
            }
        }
        for(Integer i: hm1.keySet()){
            if(hm2.containsKey(i)){
                System.out.println(i + " " + hm1.get(i) + " " + hm2.get(i));
            }
        }
    }

    public static int check(int i) {
        String s = "" + i;
        if(s.length() == 1){
            return 0;
        }
        for(int j = 0; j < s.length() - 1; j++){
            if(Integer.valueOf(s.charAt(j)) > Integer.valueOf(s.charAt(j + 1))){
                return 0;
            }
        }
        return 1;
    }
}

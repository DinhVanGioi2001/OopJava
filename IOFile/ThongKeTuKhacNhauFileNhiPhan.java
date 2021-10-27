/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Viet Anh
 */
public class ThongKeTuKhacNhauFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            FileInputStream fout = new FileInputStream("DATA.in");
            ObjectInputStream oin = new ObjectInputStream(fout);
            // ép kiểu về ArrayList<String>
            ArrayList<String> data = (ArrayList<String>)oin.readObject();
            TreeMap<String, Integer> tm = new TreeMap<>();
            ArrayList<String> list = new ArrayList<>();
            for(String i: data){
                String tmp = i.toLowerCase();
                String[] arrString = tmp.split("\\W+");
                for(String j: arrString){
                    if(tm.containsKey(j) && !j.equals("")){
                        tm.put(j, tm.get(j) + 1);
                    }else{
                        if(!j.equals("")){
                            tm.put(j, 1);
                            list.add(j);
                        }
                    }
                }
            }
            list.sort((i1, i2) -> i1.compareTo(i2));
            list.sort((i1, i2) -> Integer.compare(tm.get(i2), tm.get(i1)));
            for(String i: list){
                System.out.println(i + " " + tm.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}

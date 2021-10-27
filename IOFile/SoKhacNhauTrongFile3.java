/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;


import java.io.*;
import java.util.*;

public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream dout = new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        Scanner sc =new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < 8; i++){
//            list.add(sc.nextInt());
//        }
//        dout.writeObject(list);
        ObjectInputStream din = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> data = (ArrayList<Integer>)din.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i: data){
            if(tm.containsKey(i)){
                tm.put(i, tm.get(i) + 1);
            }else{
                tm.put(i, 1);
            }
        }
        for(Integer i: tm.keySet()){
            System.out.println(i + " " + tm.get(i));
        }
    }
}

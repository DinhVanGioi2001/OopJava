package OopJava.IOFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class SoNguyenToTrongHaiFileBin {
    
    public static int snt(int n){
        if(n < 2) return 0;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectOutputStream dout = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int i = 0; i < 19; i++){
//            l.add(sc.nextInt());
//        }
//        dout.writeObject(l);
//        dout.close();
        
        ObjectInputStream din1 = new ObjectInputStream(new FileInputStream("DATA1.in"));        
        ObjectInputStream din2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        ArrayList<Integer> list1 = (ArrayList<Integer>)din1.readObject();        
        ArrayList<Integer> list2 = (ArrayList<Integer>)din2.readObject();
        for(Integer i: list1){
            if(tm1.containsKey(i)){
                tm1.put(i, tm1.get(i) + 1);
            }else{
                if(snt(i) == 1){
                    tm1.put(i, 1);
                }
            }
        }
        for(Integer i: list2){
            if(tm2.containsKey(i)){
                tm2.put(i, tm2.get(i) + 1);
            }else{
                if(snt(i) == 1){
                    tm2.put(i, 1);
                }
            }
        }
        for(Integer i: tm1.keySet()){
            if(tm1.containsKey(i) && tm2.containsKey(i)){
                System.out.println(i + " " + tm1.get(i) + " " + tm2.get(i));
            }
        }
    }
}

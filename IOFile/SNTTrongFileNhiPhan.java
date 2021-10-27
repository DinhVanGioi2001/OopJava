/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;


import java.io.*;
import java.util.*;

public class SNTTrongFileNhiPhan{
    
//    public static int SNT(int n){
//        if(n < 2) return 0;
//        if(n <= 3) return 1;
//        if(n % 2 == 0 || n % 3 == 0) return 0;
//        for(int i = 5; i*i <= n; i+= 6){
//            if(n % i == 0 || n % (i + 2) == 0){
//                return 0;
//            }
//        }
//        return 1;
//    }
    
    public static int SNT(int n){
        if(n < 2) return 0;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0)
                return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream din = new ObjectOutputStream(new FileOutputStream("SONGUYEN.in"));
//        Scanner sc =new Scanner(System.in);
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int i = 0; i < 30; i++){
//            l.add(sc.nextInt());
//        }
//        din.writeObject(l);
        ObjectInputStream dout = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> data = (ArrayList<Integer>)dout.readObject();
        TreeMap<Integer, Integer> tm =new TreeMap<>();
        for(Integer i: data){
            if(SNT(i) == 1){
                if(tm.containsKey(i)){
                    tm.put(i, tm.get(i) + 1);
                }else{
                    tm.put(i, 1);
                }
            }
        }
        for(Integer i: tm.keySet()){
            System.out.println(i + " " + tm.get(i));
        }
    }
}

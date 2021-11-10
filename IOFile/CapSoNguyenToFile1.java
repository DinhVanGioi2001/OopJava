/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.util.*;
import java.io.*;
public class CapSoNguyenToFile1 {
    public static boolean snt(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException,IOException ,ClassNotFoundException{
        ObjectInputStream din=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> dt1 =(ArrayList<Integer>) din.readObject();
        TreeSet <Integer> ts1=new TreeSet<>();
        for(Integer q:dt1){
            if(snt(q))
                ts1.add(q);
        }
        din= new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> dt2=(ArrayList<Integer>)din.readObject();
        ArrayList<Integer> ts2=new ArrayList<>();
        for(Integer i:dt2){
           if(snt(i)){
                if(!ts2.contains(i)){
                    ts2.add(i);
                }
            }
        }
        
        long snt1;
        for(Integer i: ts1){
            if(ts2.contains(1000000-i)){
                snt1=1000000-i;
                if(i<snt1){
                    System.out.println(i +" "+ snt1);
                }
            }
        }
    }
}
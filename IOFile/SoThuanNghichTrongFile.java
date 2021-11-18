/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.*;
import java.util.ArrayList;

public class SoThuanNghichTrongFile{
    
    static int[] a= new int[1000001];    
    static int[] b= new int[1000001];
    
    public static boolean stn(int n){
        String s = "" + n; 
        int m = s.length();
        if(m % 2 == 0 || m <= 1) return false;
        for(int i = 0; i <= m/2; i++){
            if(s.charAt(i) != s.charAt(m - i - 1) || (int)s.charAt(i) % 2 == 0){
                return false;
            }
        }
        return true;
//        String s = String.valueOf(n);
//        String st = "";
//        int m = s.length();
//        int oke = 1;
//        for(int i = m-1; i >= 0; i--){
//            if((s.charAt(i) - 48) % 2 == 0){
//                return false;
//            }
//            st += s.charAt(i);
//        }
//        return (m % 2 == 1 && s.equals(st));
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)ois.readObject();
        
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>)ois.readObject();
        
        int n = 0;
        for(Integer i: list1){
            a[i]++;
        }
        for(Integer i: list2){
            b[i]++;
        }
        for(int i = 11; i <= 1000000; i++){
            if(a[i] > 0 && b[i] > 0 && stn(i)){
                System.out.println(i + " " + (a[i] + b[i]));
                n++;
            }
            if(n== 10) break;
        }
    }
}

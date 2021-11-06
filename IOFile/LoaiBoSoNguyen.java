/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.util.*;
import java.io.*;
    
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int m = Integer.parseInt(s);
            }catch(NumberFormatException e){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String i: list){
            System.out.print(i + " ");
        }
    }
}

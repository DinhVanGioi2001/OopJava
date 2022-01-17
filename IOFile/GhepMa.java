package OopJava.IOFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Viet Anh
 */
public class GhepMa {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> list1 = (ArrayList)oin.readObject();
        oin = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList)oin.readObject();
        TreeSet<String> listString = new TreeSet<>();
        TreeSet<Integer> listInt = new TreeSet<>();
        for(String s: list1){
            if(!listString.contains(s)){
                listString.add(s);
            }
        }
        for(Integer n: list2){
            if(!listInt.contains(n)){
                listInt.add(n);
            }
        }
        for(String s: listString){
            for(Integer n: listInt){
                System.out.println(s + n);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.ThucHanh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */
public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list1 = (ArrayList<String>) in.readObject();
        ArrayList<String> list3 = new ArrayList<>();
        // vì đề bài nói String có thể có nhiều từ mà output nói in ra mỗi từ
        // trên 1 dòng => cần phải tách các string và đưa vào 1 list riêng
        for(String i: list1){
            String[] s = i.toLowerCase().trim().split("\\s+");
            for(int j = 0; j < s.length; j++){
                if(!list3.contains(s[j])){
                    list3.add(s[j]);
                }
            }
        }
        // tương tự như thế
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> list2 = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            for(int j = 0; j < s.length; j++){
                if(!list2.contains(s[j])){
                    list2.add(s[j]);
                }
            }
        }
        // lặp qua list2 vì đề bài yêu cầu in ra thứ tự trong file VANBAN.in
        for(String i: list2){
            if(list3.contains(i)){
                System.out.println(i);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.util.*;
import java.io.*;

public class ThongKeTuKhacNhauFileVanBan {
    public static void main(String[] args) {
        try {
            // doc file văn bản
            Scanner sc = new Scanner(new File("VANBAN.in"));
            // doc so dong
            int n = Integer.parseInt(sc.nextLine());
            // tao treemap để lưu tru phan tu va so lan xuat hien
            TreeMap<String, Integer> tm = new TreeMap<>();
            // tao list để lưu trữ các String để sắp xếp
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                // Nhập và đưa về dạng chữ thường
                String tmp = sc.nextLine().toLowerCase();
                // Loai bo hết các kí tự đặc biệt bằng cách dùng W+
                String[] arrString = tmp.split("\\W+");
                for(String j: arrString){
                    // đe phòng có các kí tự rông
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
            // sort theo bảng chữ cái của các từ
            list.sort((i1, i2) -> i1.compareTo(i2));
            // sort theo so lan xuat hien giảm dần
            list.sort((i1, i2) -> Integer.compare(tm.get(i2), tm.get(i1)));
            // hiển thị
            for(String i: list){
                System.out.println(i + " " + tm.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}

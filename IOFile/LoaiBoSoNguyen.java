/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.util.*;
import java.io.*;
/* ý tưởng của bài tóan:
Sử dụng ArryList để lưu trữ các phần tử
sau đó sort theo từ điển
*/
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        // vì đây là vào ra file văn bản nên dùng scanner
        Scanner sc = new Scanner(new File("DATA.in"));
        // do không biết trước số phần tử nên sử dụng while(sc.hasNext())
        // suer dụng hasNext vì đọc lần tượt từng phần tử cho đến hết
        while(sc.hasNext()){
            String s = sc.next();
            // nếu câu lệnh trong khối lệnh try mà không đúng thì nó sẽ nhảy
            // sang khối catch tương ứng
            try{
                // kiểm tra xem số m có phải là số int hay không
                int m = Integer.parseInt(s);// chuyển từ String về int
            }catch(NumberFormatException e){
                // neu nó không phải định dạng của số int thì sẽ thêm vào list
                // vd như Aaa, 999999999999999999999999
                list.add(s);
            }
        }
        // sắp xếp thoe từ điển
        Collections.sort(list);
        // hiển thị
        for(String i: list){
            System.out.print(i + " ");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.util.*;
import java.io.*;

/*
Đề bài yêu cầu tìm cặp số (n, m):
(1) n < m và cả hai đều là số nguyên tố
(2) n có xuất hiện trong file DATA1.in.
(3) m có xuất hiện trong file DATA2.in
(4) n + m = 1000000 => int tmp = 1000000 - m

Ý tưởng tìm xem trong file1 và file2 có những số nguyên tố nào thì add hết vào
Sau đó lặp qua list1 và tìm xem trong list2 có phần tử chứa giá trị tmp hay không
Nếu có và giá trị n < tmp thì in ra
*/
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
        //Sử dụng object do file nhị phân và có 1 object ArrayList
        ObjectInputStream din=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> dt1 =(ArrayList<Integer>) din.readObject();
        //Tạo treeSet do yêu cầu in ra giá trị tăng dần
        TreeSet <Integer> ts1=new TreeSet<>();
        // kiểm tra trong dt1 có những số nguyên tố nào thì thêm vào ts1
        for(Integer q:dt1){
            if(snt(q))
                ts1.add(q);
        }
        // thực hiện yêu cầu cả 2 đều là số nguyên tố và n thuộc file1, m file2
        // đọc file 2
        din= new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> dt2=(ArrayList<Integer>)din.readObject();
        
        // tạo ArrayList nhằm mục đích truy xuất dữ liệu nhanh hơn
//        ArrayList<Integer> ts2=new ArrayList<>();
        TreeSet <Integer> ts2=new TreeSet<>();
        for(Integer i:dt2){
           if(snt(i)){
               // vì dùng ArrayList nên phải check xem có trùng hay không
               // đề phòng 2 giá trị đưa vào trùng nhau
                ts2.add(i);
            }
        }
        //không biết  lý do vì sao nhưng chõ này phải dùng long :((
        // thực hiện yêu cầu n < m và n + m = 1000000
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
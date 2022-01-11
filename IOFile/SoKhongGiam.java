/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.*;
import java.util.*;

/**
 *
 * @author Viet Anh
 */
public class SoKhongGiam {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Vì nó chứa 1 arrayList nên cấn sử dụng ObjectInputStream để đọc
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)ois.readObject();
        // vì đề bài in ra số từ nhỏ đến lớn + số lần xuất hiện nên sử dụng treeMap
        TreeMap<Integer, Integer> hm1 = new TreeMap<>();
        // duyệt qua list và đưa vào trong hm1
        for(Integer i: list1){
            // kiểm tra có chứa trong hm1 không
            // nếu có chứa thì đưa vào hm1
            //kiểm tra chứa trong hm1 trước vì kiểm tra check(i) mất nhiều thời gian
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i) + 1);
            }else{
                // gọi đến check(i) để kiểm tra số tăng giảm
                if(check(i) == 1){
                    // nếu nó là số tăng giảm và không chứa trong hm1 thì đẩy vào hm1
                    // dặt số lần xuất hiện là 1
                    hm1.put(i, 1);
                }
            }
        }
        // làm tương tự file 2 như file 1
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        list1 = (ArrayList<Integer>)ois.readObject();
        // có thể tạo HashMap hoặc TreeMap tùy ý
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(Integer i: list1){
            // đưa các phần tử vào trong giống như hm1
            if(hm2.containsKey(i)){
                hm2.put(i, hm2.get(i) + 1);
            }else{
                // ở đây có thể sử dụng c1 hoặc c2
                // cả 2 cách đều được bởi vì in ra số xuât hiện trong cả 2 file
                // mà file 1 đã xét rồi thì lúc in ra chỉ cần fil1 chứa và file 2 cũng có số đó là có thể in ra
                // c1
                if(check(i) == 1){
                    hm2.put(i, 1);
                }
                // c2
                // có thể không cần kiểm tra mà đưa vào luôn hm2
//                hm2.put(i, 1);
            }
        }
        // lặp qua hm1
        for(Integer i: hm1.keySet()){
            // kiểm tra xem hm2 có chứa hay không
            // nếu chứa thì in ra
            if(hm2.containsKey(i)){
                System.out.println(i + " " + hm1.get(i) + " " + hm2.get(i));
            }
        }
    }

    public static int check(int i) {
        // đưa về dạng String
        // có thể sử dụng cách String.valueOf(i) hoặc sử dụng cách dưới
        String s = "" + i;
        // vì in ra không có số từ 1 - 9 nên nếu độ dài là 1 thì return o
        if(s.length() == 1){
            return 0;
        }
        // cần lặp đến s.length - 1 vì cần so sánh phần tử j và j + 1
        // nên nếu để j < s.length thì vòng for lặp đến phần tử cuối sẽ không có phần tử phía sau để so sánh
        for(int j = 0; j < s.length() - 1; j++){
            if(Integer.valueOf(s.charAt(j)) > Integer.valueOf(s.charAt(j + 1))){
                return 0;
            }
        }
        return 1;
    }
}

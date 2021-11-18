/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.*;
import java.util.*;

/*
ý tưởng chỉ cần duyệt qua list 1 và kiểm tra nguyên tố và thuận nghịch
còn file2 thì chỉ cần duyệt qua và không cần kiểm tra nguyên tố và thuận nghịch
*/

public class NguyenToVaThuanNghich {
    
    // sàng nguyên tố
    static int[] arr = new int[10006];

    public static void isPrime(){
        Arrays.fill(arr, 1);
        arr[0] = 0;
        arr[1] = 0;
        for(int i = 2; i <= 10005; i++){
            if(arr[i] == 1){
                for(int j = i*2; j <= 10005; j+= i){
                    arr[j] = 0;
                }
            }
        }
    }
    
    public static int thuanNghich(int n){
        String s = String.valueOf(n);
        // chỉ cần duyệt đến 1/2 string là được
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int i = 1; i < 10; i++){
//            l.add(sc.nextInt());
//        }
//        out.writeObject(l);
        
        // đọc file1 và tạo 2 treeMap để đếm số thuận nghịch + snt và số lần xuất hiện của số đó
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)in1.readObject();
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        //gọi hàm sàng nguyên tố
        isPrime();
        //duyệt qua list1
        for(Integer i: list1){
            if(tm1.containsKey(i)){
                tm1.put(i, tm1.get(i) + 1);
            }else{
                if(arr[i] == 1){
                    if(thuanNghich(i) == 1){
                        tm1.put(i, 1);
                    }
                }
            }
        }
        in1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        list1 = (ArrayList<Integer>)in1.readObject();
        for(Integer i: list1){
            if(tm2.containsKey(i)){
                tm2.put(i, tm2.get(i) + 1);
            }else{
                tm2.put(i, 1);
            }
        }
        for(Integer i: tm1.keySet()){
            if(tm2.containsKey(i)){
                System.out.println(i + " " + tm1.get(i) + " " + tm2.get(i));
            }
        }
    }
}

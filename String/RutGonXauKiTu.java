package OopJava.String;

import java.util.*;

public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 1;
        StringBuilder str = new StringBuilder(s);
        // khi nao flag = 1 tuc la mang van co 2 phan tu trung nhau nam canh nhau
        while(flag == 1){
            flag = 0;
            int n = str.length()-1;
            while(n > 0){
                //kiem tra xem co 2 phan tu canh nhau bang nhau hay khong
                if(str.charAt(n) == str.charAt(n-1)){
                    str.deleteCharAt(n);
                    str.deleteCharAt(n-1);
                    n -= 2; // giam di 2 do xóa 2 lan
                    flag = 1;
                }else{
                    n--; // nguoc lai giam di 1
                }
            }
        }
        // so sanh str voi rong
        if(str.toString().equals("")){
            System.out.println("Empty String");
        }else{
            System.out.println(str.toString());
        }
    }
}

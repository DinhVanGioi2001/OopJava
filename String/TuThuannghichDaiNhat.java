/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;
import java.util.*;

public class TuThuannghichDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ds[] = new String[1000];
        int n = 0, i, dem[] = new int[1000];
        while(sc.hasNext()){ // su dung ctrl d + de dung
            String s = sc.next();
            // kiem tra thuan nghich
            if(soThuanNghich(s)){
                // tim trong danh sach
                int t = tim(s, ds, n);
                // neu tim duoc thi tang len 1
                // neu khong tim duoc thi tao them 1 danh sach moi
                if(t == -1){
                    ds[n] = s;
                    dem[n] = 1;
                    n++;
                }else{
                    dem[t]++;
                }
            }
        }
        int max = 0;
        for(i = 0; i < n; i++){
            if(ds[i].length() > max){
                max = ds[i].length();
            }
        }
        for(i = 0; i < n; i++){
            if(ds[i].length() == max){
                System.out.println(ds[i] + " " + dem[i]);
            }
        }
    }
    public static boolean soThuanNghich(String s){
            StringBuilder b = new StringBuilder(s);
            String rs = b.reverse().toString();
            return s.equals(rs);
    }
    public static int tim(String s, String[] ds, int n){
        for(int i = 0; i< n; i++){
            if(ds[i].equals(s)) return i;
        }
        return -1;
    }
}

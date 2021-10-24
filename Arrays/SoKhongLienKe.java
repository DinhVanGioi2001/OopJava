/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

/**
 *
 * @author Viet Anh
 */
import java.util.*;
public class SoKhongLienKe {
    public static int kt1(long q) {
        long tmp = q % 10;
        q /= 10;
        long dem = tmp;
        while (q > 0) {
            long n = q % 10;
            if(Math.abs((int)(n - tmp)) != 2){
                return 0;
            }
            dem += n;
            q = q / 10;
            tmp = n;
        }
        if (dem % 10 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            long s=sc.nextLong();
            if(kt1(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

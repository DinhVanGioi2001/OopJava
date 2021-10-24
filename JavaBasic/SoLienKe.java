/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.*;

public class SoLienKe {
    public static int lienKe(long n){
        long tmp1 = n % 10;
        n /= 10;
        while(n > 0){
            long tmp2 = n % 10;
            n /= 10;
            if(Math.abs((int)(tmp1 - tmp2)) != 1) return 0;
            tmp1 = tmp2;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            long n = sc.nextLong();
            int res = lienKe(n);
            if(res == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

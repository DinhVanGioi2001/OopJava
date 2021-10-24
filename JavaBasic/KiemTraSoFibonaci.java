/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.Scanner;

public class KiemTraSoFibonaci {
    public static long checkFibo(long n){
        if(n <= 2) return 1;
        long f1 = 1, f2 = 1, fn = 0;
        while(fn <= n){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            if(fn == n) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long n = sc.nextLong();
            long res = checkFibo(n);
            if(res == 1)
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
}

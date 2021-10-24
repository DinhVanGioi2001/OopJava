/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.*;

public class TinhSoFibonaci {
    static long fibonaci(int n){
        long f1 = 0; long f2 = 1;
        long fn = 0;
        
        if(n < 2) return n;
        int i = 2;
        while(i++ <= n){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int n = sc.nextInt();
            long res = fibonaci(n);
            System.out.println(res);
        }
    }
}

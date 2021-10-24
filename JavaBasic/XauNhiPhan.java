/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.Scanner;

public class XauNhiPhan {
    public static long[] F = new long[93];
    public static void solution(int n, long k){
        while(n > 2){ // vd: n = 6 : 101/01101
            if(k <= F[n-2]) n -= 2; // neu k nho hon xet xau x[n-2]
            else{ 
                k -= F[n-2]; // xet trong xau x[n-1]
                n -= 1; // giam di 1 de xet xau n-1
            }
        }
        if(n == 1){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong(); // de kieu long vi F[93] rat lon
            F[1] = F[2] = 1;
            for(int i = 3; i < 93; i++)
                F[i] = F[i-2] + F[i-1];
            solution(n, k);
        }
    }
}

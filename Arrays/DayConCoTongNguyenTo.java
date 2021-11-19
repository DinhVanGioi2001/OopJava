/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */
public class DayConCoTongNguyenTo {
    public static int n;
    public static int Y[] = new int[100];
    public static int X[] = new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            int temp[] = new int[n];
            for(int i = 0; i < n; i ++){
                temp[i] = sc.nextInt();
            }
            Arrays.sort(temp);
            for(int i = 0; i < n; i ++){
                X[i] = temp[n-i-1];
            }
            for(int i = n - 1; i >= 0; i --){
                int count = 0;
                int s = 0;
                s += X[i];
                Y[count++] = X[i];
                if(isPrime(s))
                    print(count);
                solution(i, count, s);
            }
        }
    }
    
    static void solution(int i, int count, int s){
        int j = n - 1;
        while(j > i) {
            int first = count;
            s += X[j];
            Y[count++] = X[j];
            if(isPrime(s))
                print(count);
            if(j < n - 1)
                solution(j, count, s);
            for(int k = first; k < count; k ++)
                s -= Y[k];
            count = first;
            j--;
        }
    }
    
    static void print(int count) {
        for(int i = 0; i < count; i ++)
            System.out.print(Y[i] + " ");
        System.out.println();
    }
    
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=(long)Math.sqrt(n);i++){
            if(n % i ==0) return false;
        }
        return true;
    }
}
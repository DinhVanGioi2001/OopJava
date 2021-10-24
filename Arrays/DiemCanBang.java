/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.*;

public class DiemCanBang {
    public static int solution(int[] a, int n){
        int sum = 0, leftsum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        for(int i = 0; i < n; i++){
            sum -= a[i];
            if(sum == leftsum)
                return i + 1;
            leftsum += a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            } 
            int res = solution(a, n);
            System.out.println(res);
        }
    }
}

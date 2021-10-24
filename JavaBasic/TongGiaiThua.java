/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.*;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1, tmp = 1;
        for(int i =2; i <= n; i++){
            tmp  = tmp*i;
            sum += tmp;
        }
        System.out.println(sum);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.*;
public class HinhChuNhat {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.print("0");
        }else{
            int sum = 2 * (a + b);
            System.out.print(sum + " ");        
            System.out.print(a * b);
        }
    }
}

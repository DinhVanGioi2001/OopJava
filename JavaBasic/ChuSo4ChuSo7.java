/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.Scanner;

public class ChuSo4ChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int dem = 0;
        while(n > 0){
            long t = n % 10;
            if(t == 4 || t == 7) dem++;
            n /= 10;
        }
        if(dem == 4 || dem == 7){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}

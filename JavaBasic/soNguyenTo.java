/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;


import java.util.Scanner;
import java.lang.Math;

public class soNguyenTo {
    public static int ngTo(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            if(ngTo(n) == 1)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}

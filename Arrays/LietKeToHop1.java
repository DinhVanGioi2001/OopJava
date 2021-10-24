/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.*;

public class LietKeToHop1 {
    public static int n, k;
    public static int[] a = new int[20];
    public static boolean check(){ // kiem tra to hop da max hay chua
        for(int i = k; i > 0; i--){
            if(a[i] != n-k+i){
                return false;
            }
        }
        return true;
    }
    public static void solution(){
        int i = k;
        //kiem tra xem phan tu thu may dang co gia tri nho hon
        while(i >= 0 && a[i] == n - k + i) i--;
        //neu phan tu thu i nho hon thi tang len 1 don vi
        if(i > 0){
            a[i]++;
            // cac phan tu sau no tang len 1 don 1
            for(int j = i + 1; j <= k; j++) a[j] = a[i] + j -i;
        }
    }
    //hien thi mang
    public static void display(){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 1; i <= k; i++){
            a[i] = i;
        }
        display();
        int count = 1;
        while(!check()){
            solution();
            display();
            count++;
        }
        System.out.print("Tong cong co " + count + " to hop");
    }
}

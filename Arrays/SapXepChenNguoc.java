/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;
import java.util.*;
/**
 *
 * @author Viet Anh
 */
public class SapXepChenNguoc {
    public static void insertSort(int[] a, int n){
        String[] res = new String[n];
        res[0] = Integer.toString(a[0]);
        for(int i = 1; i < n; i++){
            int index = i -1;
            int value = a[i];
            while(index >= 0 && a[index] > value){
                a[index + 1] = a[index];
                index--;
            }
            a[index+1] = value;
            StringBuilder tmp = new StringBuilder();
            for(int j= 0; j <= i; j++){
                // them vao va them ca dau cach
                tmp.append(a[j] + " ");
            }
            // bien tmp thanh chuoi
            res[i] = tmp.toString();
        }
        for(int i = n-1; i >= 0; i--){
            System.out.println("Buoc " + i + ": " + res[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i= 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        insertSort(a, n);
    }
}

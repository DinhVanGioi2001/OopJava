/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

/**
 *
 * @author Viet Anh
 */
import java.util.*;

public class SapXepChonNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] res = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // dung de dem so buoc
        int c = 0;
        for(int i = 0; i < n - 1; i++){
            // su dung sap xep chon
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // thuc hien day vao mang String res
            // bang cach su dung StringBuilder
            int b = arr[i];
            arr[i] = arr[min];
            arr[min] = b;
            StringBuilder tmp = new StringBuilder();
            for(int j= 0; j <n; j++){
                // them vao va them ca dau cach
                tmp.append(arr[j]);
                tmp.append(" ");
            }
            // bien tmp thanh chuoi
            res[i] = tmp.toString();
            //tang c va chuyen flag ve khong
            c++;
        }
        for(int i = c-1; i >= 0; i--){
            System.out.println("Buoc " + (i + 1) + ": " + res[i]);
        }
    }
}

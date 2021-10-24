/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.Scanner;

public class SapXepDoiChoTrucTiepNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            //tao bien c de dem so lan sap xep
            // flag de kiem tra xem mang da sap xep theo de bai chua
            int c = 0, flag = 0;
            // mang res de chua mang moi lan sap xep
            String[] res = new String[n];
            // sap xep doi cho truc tiep
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(a[j] < a[i]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                        flag = 1;
                    }
                }
                // neu flag = 1 thi mang chua duoc sap xep
                // thuc hien day vao mang String res
                // bang cach su dung StringBuilder
                if(flag == 1){
                    StringBuilder tmp = new StringBuilder();
                    for(int j = 0; j < n; j++){
                        // them vao va them ca dau cach
                        tmp.append(a[j]);
                        tmp.append(" ");
                    }
                    // bien tmp thanh chuoi
                    res[i] = tmp.toString();
                    //tang c va chuyen flag ve khong
                    c++;
                    flag = 0;
                }
            }
            for(int i = c -1; i >= 0; i--){
                System.out.println("Buoc " + (i + 1) + ": " + res[i]);
            }
        }
    }
}

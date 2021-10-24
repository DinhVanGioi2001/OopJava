/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.*;

public class SapXepDoiChoTrucTiep {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        int count = 1;
//        for(int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n - 1; i++){
//            for(int j = i + 1; j < n; j++){
//                if(a[i] > a[j]){
//                    int tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }
//            }
//            System.out.print("Buoc " + count++ + ": ");
//            for(int h = 0; h < n; h++){
//                System.out.print(a[h] + " ");
//            }
//            System.out.println();
//        }
//    }
    public static Scanner sc = new Scanner(System.in);
    static void nhap(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void xuat(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void In(int a[], int n) {
        n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    // swap arr[j+1] and arr[j]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }System.out.print("Buoc " + (i+1) + ": ");
            xuat(a, n);

        }
    }


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        In(a, n);

    }
}

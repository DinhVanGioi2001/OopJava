/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.*;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        } 
        int count = 1;
        for(int i = 0; i < n-1;i++){
            System.out.print("Buoc " + count++ + ": ");
            int min = a[i], k = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < min){
                    k = j;
                    min = a[j];
                }
            }
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            for(int h = 0; h < n; h++){
                System.out.print(a[h] + " ");
            }
            System.out.println();
        }
    }
}
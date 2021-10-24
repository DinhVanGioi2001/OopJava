/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */

public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            int count1 = 0, count0 = 0;
            for(int j = 0; j < 3; j++){
                if(a[i][j] == 1){
                    count1++;
                }else{
                    count0++;
                }
            }
            if(count1 > count0){
                count++;
            }
        }
        System.out.print(count);
    }
}

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

public class QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int j = 0;
            for(int i = 0; i < n-1; i++){
                if(a[i] > a[i + 1]){
                    j = i + 1;
                    break;
                }
            }
            System.out.println(j);
        }
    }
}

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

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int j = 1, check = 0, i = 0;
        while(i < a.length){
            if(j < a[i]){
                System.out.println(j);
                j++;
                check = 1;
            }else{
                i++;
                j++;
            }
        }
        if(check == 0){
            System.out.println("Excellent!");
        }
    }
}

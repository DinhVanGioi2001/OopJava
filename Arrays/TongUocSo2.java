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
public class TongUocSo2 {
    public static void snt(int a, int b){
        long[] arr = new long[b + 5];
        Arrays.fill(arr, 1);
        //Su dung y tuong sang nguyen to
        for(int i = 2; i <= b/2; i++){
            for(int j = i*2; j <= b; j+= i){
                if(j % i == 0){
                    arr[j] += i;
                }
            }
        }
        int count = 0;
        for(int i = a; i <= b; i++){
            if(arr[i] > i){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        snt(a, b);
    }
}

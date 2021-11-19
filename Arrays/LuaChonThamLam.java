/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.*;

public class LuaChonThamLam {
//    public static void solution(int n, int s){
//        // kiem tra xem dieu kien 
//        // vd 3 40 khong tm vi 999 tong chi duoc 27 
//        // neu s = 0 cung khong thoa man
//        if(s > 9*n || s == 0){
//            System.out.print("-1 -1");
//            return;
//        }
//        //tao 2 ham de chua so nho nhat va lon nhat
//        int[] smallNum = new int[n];
//        int[] largeNum = new int[n];
//        // gan tmp = s de dung tim so lon nhat
//        int tmp = s, i;
//        // vd 2 9 thi so nho nhat se la 9-1 = 8 va them so 1 da tru vao dau
//        s -= 1;
//        for(i = n-1; i >0; i--){
//            if(s > 9){
//                smallNum[i] = 9;
//                s -= 9;
//            }else{
//                smallNum[i] = s;
//                s = 0;
//            }
//        }
//        // neu i = 0 thi cong them 1 vao dau tien
//        smallNum[i] = s + 1;
//        // tim so lon nhat
//        for(i = 0; i < n; i++){
//            // >= 9 vi so lon nhat co the la 9
//            if(tmp >= 9){
//                largeNum[i] = 9;
//                tmp -= 9;
//            }else{
//                largeNum[i] = tmp;
//                tmp = 0;
//            }
//        }
//        // hien thi nho va lon nhat
//        for(i = 0; i < n; i++){
//            System.out.print(smallNum[i]);
//        }
//        System.out.print(" ");
//        for(i = 0; i < n; i++){
//            System.out.print(largeNum[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int s = sc.nextInt();
//        solution(n, s);
//    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        findMin(n, s);
        findMax(n, s);
    }
    static void findMin(int n, int s){
        if (s == 0){
            System.out.print(n == 1 ? "0 " : "-1 ");
             
            return ;
        }
  
        if (s > 9*n){
            System.out.print("-1 ");
            return ;
        }
  
        int[] res = new int[n];
        s -= 1;
  
        for (int i=n-1; i>0; i--){
            if (s > 9){
                res[i] = 9;
                s -= 9;
            }
            else{
                res[i] = s;
                s = 0;
            }
        }
        res[0] = s + 1;  
        String min = "";
        for (int i=0; i<n; i++){
            min += res[i];
        }
        
        System.out.print(min + " ");
    }
    
    static void findMax(int n, int s){
        if (s == 0){
            System.out.print(n == 1 ? "0" : "-1" );
            System.out.println("");
            return ;
        }
  
        if (s > 9*n){
            System.out.println("-1");
            return ;
        }
        
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(s>9){
                res[i] = 9;
                s-=9;
            }
            else{
                res[i] = s;
                s=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]);
        }
        System.out.println("");
    }
}

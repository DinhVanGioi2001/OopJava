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
    public static int count = 0;
    public static void xuat(int[] x, int k){
        for(int i=1;i<=k;i++){
            System.out.print(x[i]+" ");
        }System.out.println();
    }
    public static void tohop(int i, int[] x, int n, int k){
        
        for(int j=x[i-1]+1;j<=n-k+i;j++){
            x[i]=j;
            if(i==k){
                count++;
                xuat(x, k);
            }
            else tohop(i+1, x,n, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
       
        int [] x=new int [1000];
        count =0;
        tohop(1, x, n, k);
        System.out.println("Tong cong co " + count + " to hop");
    }
}

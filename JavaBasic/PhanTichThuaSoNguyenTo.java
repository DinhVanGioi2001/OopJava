///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package OopJava.JavaBasic;
//
//import java.util.*;
//
//public class PhanTichThuaSoNguyenTo {
//    static void solution(int n){
//        int dem = 0;
//        int i = 2;
//        while(n > 1){
//            if(n % i == 0){
//                dem++;
//                if(n == i)
//                    System.out.print(n + "(" + dem + ")" + " ");
//                n /= i;
//            }else{
//                if(dem > 0){
//                    System.out.print(i + "(" + dem + ")" + " ");
//                    dem = 0;
//                }
//                i++;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        int count = 1;
//        while(test-- >0){
//            int n = sc.nextInt();
//            System.out.printf("Test %d: ", count++);
//            solution(n);
//            System.out.println();
//        }
//    }
//}

import java.util.*;
public class PhanTichThuaSoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    static int snt(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // tao bien count de in ra so bo test
        int count = 1;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.print("Test " + count++ + ": ");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(snt(i) == 1) {
                    int dem = 0;
                    while (n % i == 0) {
                        dem++;
                        n = n / i;
                    }
                    // xet dem > 0 de phong truong hop dem = 0 va van in ra i(0)
                    if(dem > 0)
                        System.out.print(i + "(" + dem + ")" + " ");
                }
            }
            // neu n la so nguyen to thi in ra
            // khong can xet n >1 vì chi can la so nguyen to da co dieu kien > 1
            if(snt(n) == 1) System.out.print(n + "(1)");
            // sau bo test thi in ra \n
            System.out.println();
        }
    }
}